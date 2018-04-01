package com.Arunali.example;
import java.util.Scanner;
import com.Arunali.example.util.NumberUtils;

public class Fourteen {
	public final static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println(" enter number to check: ");
		String input = sc.next();
		boolean isvalid =NumberUtils.validateNumber(input);
		if(isvalid){
			int number = Integer.parseInt(input);
			System.out.println(NumberUtils.checkEvenOrOdd(number));
		}
		
		else
			System.out.println("invalid input");
}
}
