package com.Arunali.example;
import java.util.Scanner;

public class Twenty {
	public final static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the fibonnaci number");
		int certainNumber = sc.nextInt();
		int firstNumber = 0;
		int secondNumber = 1;
		int CurrentNumber;
		
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		for(int i=0;i<certainNumber;i++){
			CurrentNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = CurrentNumber;
			System.out.println(CurrentNumber);
			if(CurrentNumber == certainNumber)
				break;
		}
	
}
}
