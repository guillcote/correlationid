package com.collatzsoftware.correlationid.core;

import java.util.concurrent.atomic.AtomicLong;

import com.collatzsoftware.correlationid.core.base64.Base64Encoder;

class SliceGenerator {
	private AtomicLong value = new AtomicLong();
	private String prefix;
	private int length;
	
	SliceGenerator(String preprefix, long l) {
		StringBuffer buffer = new StringBuffer(preprefix.length() + 13);
		
		buffer.append(preprefix);
		buffer.append('-');

		Base64Encoder.encode(l, buffer);
		
		buffer.append('-');
		
		prefix = buffer.toString();
		length = prefix.length() + 11;		
	}
	
	String next() {
		StringBuffer buffer = new StringBuffer(length);
		
		buffer.append(prefix);
		
		Base64Encoder.encode(value.incrementAndGet(), buffer);
		
		return buffer.toString();
	}
	
}
