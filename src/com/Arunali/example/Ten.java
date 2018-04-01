package com.Arunali.example;
import java.util.Scanner;

import com.Arunali.example.util.NumberUtils;

public class Ten {
	
	public final static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
		
		System.out.println("Enter the number to reverse ");
		String input= sc.next();
		boolean isvalid = NumberUtils.validateNumber(input);
		
		if (isvalid){
			int number =Integer.parseInt(input);
			System.out.println("reversed number "+NumberUtils.ReverseNumber(number));
		}
		else
		System.out.println("invalid inputs");
	}

}
