package com.collatzsoftware.correlationid.core;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.collatzsoftware.correlationid.core.SliceGenerator;

class SliceGeneratorTest {

	@Test
	void testNext_bozo_1() {
		SliceGenerator sliceGenerator = new SliceGenerator("bozo", 1);
		
		assertThat(sliceGenerator.next()).isEqualTo("bozo-1-1");
		assertThat(sliceGenerator.next()).isEqualTo("bozo-1-2");
		assertThat(sliceGenerator.next()).isEqualTo("bozo-1-3");
	}

	@Test
	void testNext_foobar_100() {
		SliceGenerator sliceGenerator = new SliceGenerator("foobar", 100);
		
		assertThat(sliceGenerator.next()).isEqualTo("foobar-1a-1");
		assertThat(sliceGenerator.next()).isEqualTo("foobar-1a-2");
		assertThat(sliceGenerator.next()).isEqualTo("foobar-1a-3");
	}
	
}
