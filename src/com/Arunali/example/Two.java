package com.Arunali.example;
import java.util.Scanner;
import com.Arunali.example.util.NumberUtils;

public class Two {
	public final static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		String number = sc.next();
		
		//validating the inputs
		boolean ValidInputs = NumberUtils.validateNumber(number);
		if(ValidInputs){
			int num = Integer.parseInt(number);
			System.out.println("The entered number is  "+num);
			}
		else
			System.out.println("invalid inputs");
		
		
}
	
	
}
