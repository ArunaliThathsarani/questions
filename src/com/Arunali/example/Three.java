package com.Arunali.example;
import java.util.Scanner;
import com.Arunali.example.util.NumberUtils;
public class Three {
	public final static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("enter first number  ");
		String num1 = sc.next();
		System.out.print("enter second number ");
		String num2 = sc.next();
		boolean validInput = NumberUtils.validateNumbers(num1,num2);
		
		if(validInput){
			int firstnumber=Integer.parseInt(num1);
			int secondnumber= Integer.parseInt(num2);
			System.out.printf("sum of  numbers= "+NumberUtils.sumOfNumbers(firstnumber,secondnumber));
	}
	}
}