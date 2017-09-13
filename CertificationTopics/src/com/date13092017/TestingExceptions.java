package com.date13092017;

import java.io.FileReader;
import java.io.IOException;

public class TestingExceptions {
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		
		try {
			System.out.println(a[2]);
			throw new ArrayIndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException i){
			System.out.println("Exception1");
		} catch (Exception e) {
			System.out.println("Exception2");
		}
		
		
		
//		FileReader reader = null;
//		try {
//			reader = read();
//		} catch (IOException e){
//			try {
//				if (reader != null) reader.close();
//			} catch (IOException inner) {
//				
//			}
//		}
//		
//	}
//	
//	private static FileReader read() throws IOException {
//		
//	}
		}
}
