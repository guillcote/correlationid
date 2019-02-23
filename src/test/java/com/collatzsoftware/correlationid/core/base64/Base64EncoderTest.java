package com.collatzsoftware.correlationid.core.base64;


import static org.assertj.core.api.Assertions.assertThat;


import org.junit.jupiter.api.Test;

import com.collatzsoftware.correlationid.core.base64.Base64Encoder;

public class Base64EncoderTest {

	@Test
	public void testEncode_0() {
		String result = Base64Encoder.encode(0);
		
		assertThat(result).isEqualTo("0");
	}

	@Test
	public void testEncode_1() {
		String result = Base64Encoder.encode(1);
		
		assertThat(result).isEqualTo("1");
	}
	
	@Test
	public void testEncode_2() {
		String result = Base64Encoder.encode(2);
		
		assertThat(result).isEqualTo("2");
	}	

	@Test
	public void testEncode_9() {
		String result = Base64Encoder.encode(9);
		
		assertThat(result).isEqualTo("9");
	}	

	@Test
	public void testEncode_10() {
		String result = Base64Encoder.encode(10);
		
		assertThat(result).isEqualTo("A");
	}	
	

	@Test
	public void testEncode_35() {
		String result = Base64Encoder.encode(35);
		
		assertThat(result).isEqualTo("Z");
	}	

	@Test
	public void testEncode_36() {
		String result = Base64Encoder.encode(36);
		
		assertThat(result).isEqualTo("a");
	}	

	@Test
	public void testEncode_61() {
		String result = Base64Encoder.encode(61);
		
		assertThat(result).isEqualTo("z");
	}	


	@Test
	public void testEncode_62() {
		String result = Base64Encoder.encode(62);
		
		assertThat(result).isEqualTo("+");
	}	

	@Test
	public void testEncode_63() {
		String result = Base64Encoder.encode(63);
		
		assertThat(result).isEqualTo("*");
	}	

	@Test
	public void testEncode_64() {
		String result = Base64Encoder.encode(64);
		
		assertThat(result).isEqualTo("10");
	}	


	@Test
	public void testEncode_65() {
		String result = Base64Encoder.encode(65);
		
		assertThat(result).isEqualTo("11");
	}	


	@Test
	public void testEncode_66() {
		String result = Base64Encoder.encode(66);
		
		assertThat(result).isEqualTo("12");
	}	

	@Test
	public void testEncode_127() {
		String result = Base64Encoder.encode(127);
		
		assertThat(result).isEqualTo("1*");
	}	
	
	@Test
	public void testEncode_128() {
		String result = Base64Encoder.encode(128);
		
		assertThat(result).isEqualTo("20");
	}	

	@Test
	public void testEncode_129() {
		String result = Base64Encoder.encode(129);
		
		assertThat(result).isEqualTo("21");
	}

	@Test
	public void testEncode_255() {
		String result = Base64Encoder.encode(255);
		
		assertThat(result).isEqualTo("3*");
	}

	@Test
	public void testEncode_256() {
		String result = Base64Encoder.encode(256);
		
		assertThat(result).isEqualTo("40");
	}

	@Test
	public void testEncode_257() {
		String result = Base64Encoder.encode(257);
		
		assertThat(result).isEqualTo("41");
	}

	@Test
	public void testEncode_511() {
		String result = Base64Encoder.encode(511);
		
		assertThat(result).isEqualTo("7*");
	}

	@Test
	public void testEncode_512() {
		String result = Base64Encoder.encode(512);
		
		assertThat(result).isEqualTo("80");
	}

	@Test
	public void testEncode_513() {
		String result = Base64Encoder.encode(513);
		
		assertThat(result).isEqualTo("81");
	}

	@Test
	public void testEncode_1023() {
		String result = Base64Encoder.encode(1023);
		
		assertThat(result).isEqualTo("F*");
	}

	@Test
	public void testEncode_1024() {
		String result = Base64Encoder.encode(1024);
		
		assertThat(result).isEqualTo("G0");
	}
	
	@Test
	public void testEncode_1025() {
		String result = Base64Encoder.encode(1025);
		
		assertThat(result).isEqualTo("G1");
	}
		
	
	@Test
	public void testEncode_2047() {
		String result = Base64Encoder.encode(2047);
		
		assertThat(result).isEqualTo("V*");
	}
			
	
	@Test
	public void testEncode_2048() {
		String result = Base64Encoder.encode(2048);
		
		assertThat(result).isEqualTo("W0");
	}

	
	@Test
	public void testEncode_2049() {
		String result = Base64Encoder.encode(2049);
		
		assertThat(result).isEqualTo("W1");
	}
		
	@Test
	public void testEncode_4095() {
		String result = Base64Encoder.encode(4095);
		
		assertThat(result).isEqualTo("**");
	}
	
	@Test
	public void testEncode_4096() {
		String result = Base64Encoder.encode(4096);
		
		assertThat(result).isEqualTo("100");
	}
	
	@Test
	public void testEncode_4097() {
		String result = Base64Encoder.encode(4097);
		
		assertThat(result).isEqualTo("101");
	}
			
	@Test
	public void testEncode_8191() {
		String result = Base64Encoder.encode(8191);
		
		assertThat(result).isEqualTo("1**");
	}
		
	@Test
	public void testEncode_8192() {
		String result = Base64Encoder.encode(8192);
		
		assertThat(result).isEqualTo("200");
	}
		
	@Test
	public void testEncode_8193() {
		String result = Base64Encoder.encode(8193);
		
		assertThat(result).isEqualTo("201");
	}
		
	@Test
	public void testEncode_16383() {
		String result = Base64Encoder.encode(16383);
		
		assertThat(result).isEqualTo("3**");
	}	
	
	@Test
	public void testEncode_16384() {
		String result = Base64Encoder.encode(16384);
		
		assertThat(result).isEqualTo("400");
	}	
	
	@Test
	public void testEncode_16385() {
		String result = Base64Encoder.encode(16385);
		
		assertThat(result).isEqualTo("401");
	}	
			
	@Test
	public void testEncode_32767() {
		String result = Base64Encoder.encode(32767);
		
		assertThat(result).isEqualTo("7**");
	}	
			
	@Test
	public void testEncode_32768() {
		String result = Base64Encoder.encode(32768);
		
		assertThat(result).isEqualTo("800");
	}	
		
	@Test
	public void testEncode_32769() {
		String result = Base64Encoder.encode(32769);
		
		assertThat(result).isEqualTo("801");
	}	
	
	@Test
	public void testEncode_65535() {
		String result = Base64Encoder.encode(65535);
		
		assertThat(result).isEqualTo("F**");
	}		
	
	@Test
	public void testEncode_65536() {
		String result = Base64Encoder.encode(65536);
		
		assertThat(result).isEqualTo("G00");
	}	
	
	@Test
	public void testEncode_65537() {
		String result = Base64Encoder.encode(65537);
		
		assertThat(result).isEqualTo("G01");
	}	
	
	@Test
	public void testEncode_262143() {
		String result = Base64Encoder.encode(262143);
		
		assertThat(result).isEqualTo("***");
	}	
	
	@Test
	public void testEncode_262144() {
		String result = Base64Encoder.encode(262144);
		
		assertThat(result).isEqualTo("1000");
	}	
		
	@Test
	public void testEncode_262145() {
		String result = Base64Encoder.encode(262145);
		
		assertThat(result).isEqualTo("1001");
	}	
	
	@Test
	public void testEncode_16777215() {
		String result = Base64Encoder.encode(16777215);
		
		assertThat(result).isEqualTo("****");
	}	
		
	@Test
	public void testEncode_16777216() {
		String result = Base64Encoder.encode(16777216);
		
		assertThat(result).isEqualTo("10000");
	}	
		

	@Test
	public void testEncode_16777217() {
		String result = Base64Encoder.encode(16777217);
		
		assertThat(result).isEqualTo("10001");
	}	
		
	
	@Test
	public void testEncode_1073741823() {
		String result = Base64Encoder.encode(1073741823);
		
		assertThat(result).isEqualTo("*****");
	}	
		
	@Test
	public void testEncode_1073741824() {
		String result = Base64Encoder.encode(1073741824);
		
		assertThat(result).isEqualTo("100000");
	}	
		
	@Test
	public void testEncode_1073741825() {
		String result = Base64Encoder.encode(1073741825);
		
		assertThat(result).isEqualTo("100001");
	}	
				
	@Test
	public void testEncode_68719476735() {
		String result = Base64Encoder.encode(68719476735L);
		
		assertThat(result).isEqualTo("******");
	}	
	
	@Test
	public void testEncode_68719476736() {
		String result = Base64Encoder.encode(68719476736L);
		
		assertThat(result).isEqualTo("1000000");
	}	
		
	@Test
	public void testEncode_68719476737() {
		String result = Base64Encoder.encode(68719476737L);
		
		assertThat(result).isEqualTo("1000001");
	}	
	
	@Test
	public void testEncode_4398046511103() {
		String result = Base64Encoder.encode(4398046511103L);
		
		assertThat(result).isEqualTo("*******");
	}	
	
	@Test
	public void testEncode_4398046511104() {
		String result = Base64Encoder.encode(4398046511104L);
		
		assertThat(result).isEqualTo("10000000");
	}	
		
	@Test
	public void testEncode_4398046511105() {
		String result = Base64Encoder.encode(4398046511105L);
		
		assertThat(result).isEqualTo("10000001");
	}	
			
}

