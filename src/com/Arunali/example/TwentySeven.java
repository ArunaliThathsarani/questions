package com.Arunali.example;
import java.util.Scanner;
import com.Arunali.example.util.NumberUtils;

public class TwentySeven {
	private final static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("enter base :");
	String firstInput=sc.next();
	System.out.println("enter number :");
	String secondInput= sc.next();
	
	if(NumberUtils.validateNumber(firstInput)&&NumberUtils.validateNumber(secondInput)){
		int base=Integer.parseInt(firstInput);
		int number=Integer.parseInt(secondInput);
		if(!NumberUtils.checkTheNumber(base, number)){
			System.out.println("invalid");}
		else
		System.out.println(NumberUtils.AnyBaseToDecimal(number,base));
	}
	else
		System.out.println("invalid input");
	
	
	
	
	
}
}
