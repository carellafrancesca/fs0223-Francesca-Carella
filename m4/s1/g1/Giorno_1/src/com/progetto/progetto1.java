package com.progetto;

public class progetto1 {
	
	static String[] elementi5 = {"elemento1", "elemento2", "elemento3", "elemento4", "elemento5"};

	public static void main(String[] args) {
		
		System.out.println(moltiplica(8, 5));		
		System.out.println(concat("esempio" , 10));
		String[] elementi6 = addArr(elementi5, "elemento6");
		
		for(int i = 0; i < elementi6.length; i++) {
			System.out.println(elementi6[i]);
		}
	}
	
	public static int moltiplica(int a, int b) {
		return a * b;
	}
	
	public static String concat(String x, int y) {
		String result = x + y;
		return result;
	}
	
	public static String[] addArr(String[] s, String z) {
		String[] array = new String[6];
		
		array[0] = s[0];
		array[1] = s[1];
		array[2] = z;
		array[3] = s[2];
		array[4] = s[3];
		array[5] = s[4];
		
		return array;
	}

}
