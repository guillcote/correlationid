package com.collatzsoftware.correlationid.core.base64;

public class Base64Encoder {
	private static final char[] chars = {
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
			'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
			'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
			'U', 'V', 'W', 'X', 'Y', 'Z',
			'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
			'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 
			'u', 'v', 'w', 'x', 'y', 'z',
			'+', '*' 
	};
	
	private Base64Encoder() {
	}
	
	public static String encode(long l) {
		StringBuffer buffer = new StringBuffer();
		
		encode(l, buffer);
		
		return buffer.toString();
	}

	public static void encode(long l, StringBuffer buffer) {
		int index = ((int) l) & 63;
		long r = l >> 6;
		
		if (r > 0) {
			encode(r, buffer);
		}
		
		buffer.append(chars[index]);
	}
}
