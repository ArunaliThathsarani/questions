package com.Arunali.example.util;

public final class StringUtil {
	private StringUtil(){}
	
		
		
		public static String ReverseString (String input){
			char[] letters = new char[input.length()];
			for(int i=0; i<input.length();i++){
				letters[i]=input.charAt(input.length()-1-i);
			}
			String reversedString = new String(letters);
			return reversedString;
		
	}
}
