package com.Arunali.example;
import java.util.Scanner;


public class Nineteen {
public final static Scanner sc = new Scanner(System.in);	
public static void main(String[] args) {
	System.out.println("enter no of terms?");
	int number =sc.nextInt();
	int firstnumber=0;
	int secondnumber=1;
	System.out.println(firstnumber);
	System.out.println(secondnumber);
	for(int i=1; i<=number-2; i++){
	int CurrentNumber=firstnumber+secondnumber;
	System.out.println(CurrentNumber);
	firstnumber=secondnumber;
	secondnumber=CurrentNumber;
	}
}
	
	
	}
	
	


