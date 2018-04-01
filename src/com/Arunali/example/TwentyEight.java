package com.Arunali.example;
import java.util.Scanner;

import com.Arunali.example.util.NumberUtils;

public class TwentyEight {
	private final static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the number");
		String firstInput = sc.next();
		System.out.println("enter the base");
		String secondInput = sc.next();
		if(NumberUtils.validateNumber(firstInput)&&NumberUtils.validateNumber(secondInput)){
			int number=Integer.parseInt(firstInput);
			int base = Integer.parseInt(secondInput);
			NumberUtils.DecimalToAnyBase(number,base);
		}
		else
			System.out.println("invalid input");
	}
}
