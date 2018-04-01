package com.Arunali.example;
import java.util.Scanner;
import com.Arunali.example.util.NumberUtils;

public class Eleven {
	public final static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("enter first input");
		String firstInput = sc.next();
		System.out.print("enter second input");
		String secondInput= sc.next();
		
		boolean isvalid = NumberUtils.validateNumbers(firstInput,firstInput);
		if(isvalid){
			int firstNumber=Integer.parseInt(firstInput);
			int secondNumber= Integer.parseInt(secondInput);
			System.out.println("before swapping: "+"first number "+firstNumber+"  "+"second number "+secondNumber);
			NumberUtils.SwapNumbers(firstNumber,secondNumber);
		}
		else
			System.out.println("invalid inputs");
		
}
	
}
