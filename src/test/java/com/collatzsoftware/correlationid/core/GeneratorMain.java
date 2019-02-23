package com.collatzsoftware.correlationid.core;

import com.collatzsoftware.correlationid.core.Generator;

public class GeneratorMain {
	public static void main(String[] argv) throws InterruptedException {
		Generator generator = new Generator("g");
		
		while (true) {
			System.out.print(generator.next());
			System.out.print("     ");
			System.out.println(generator.keys());
			
			Thread.sleep(10000);
		}
			
		
	}
}
