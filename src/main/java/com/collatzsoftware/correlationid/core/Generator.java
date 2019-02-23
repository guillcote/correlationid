package com.collatzsoftware.correlationid.core;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Generator {
	
	private static final int OFFSET = 23664854;
	private static final int ALLOCATE_FUTURE = 20;
	private static final int CLEAN_UP_COUNT = 4;
	private static final int DELAY = 1048576;  // 2^20 -- ~ 17,5 minutes
	
	private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
	private final Runnable cleanUpRunnable = new CleanUpRunnable();
	
	private String prefix;
	
	private ConcurrentHashMap<Integer, SliceGenerator> sliceGeneratorMap = new ConcurrentHashMap<Integer, SliceGenerator>(64);
	
	public Generator(String prefix) {
		this.prefix = prefix;
		
		init();
		
		scheduler.scheduleAtFixedRate(cleanUpRunnable, DELAY, DELAY, TimeUnit.MILLISECONDS);
	}


	public String next() {
		return getSliceGenerator(getCurrent()).next();
	}	
	
	int size() {
		return sliceGeneratorMap.size();
	}

	
	String keys() {
		SortedSet<Integer> result = new TreeSet<>(sliceGeneratorMap.keySet());
		
		return result.toString();
	}
	
	private SliceGenerator getSliceGenerator(int i) {
		SliceGenerator result = sliceGeneratorMap.get(i);
		
		if (null != result) {
			return result;
		}
		
		SliceGenerator candidateSliceGenerator = new SliceGenerator(prefix, i - OFFSET);
		
		sliceGeneratorMap.putIfAbsent(i, candidateSliceGenerator);
		
		return sliceGeneratorMap.get(i);
	}
	
	
	private int getCurrent() {
		long current = System.currentTimeMillis();
		
		return (int) (current >> 16);
	}
	
	private void init() {
		init(getCurrent(), ALLOCATE_FUTURE);
	}
	
	private void init(int start, int count) {
		int last = start + count;
		
		for (int i = start; i < last; i++) {
			getSliceGenerator(i);
		}
	}

	private void cleanUp() {
		int threshold = getCurrent() - CLEAN_UP_COUNT;
		
		Iterator<Integer> i = sliceGeneratorMap.keySet().iterator();
		
		while (i.hasNext()) {
			if (i.next() < threshold) {
				i.remove();
			}
		}

		init();
 	}

	private class CleanUpRunnable implements Runnable {
		@Override
		public void run() {
			cleanUp();			
		}
	}
}
