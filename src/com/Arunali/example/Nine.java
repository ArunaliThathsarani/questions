package com.Arunali.example;
import java.util.Scanner;
import com.Arunali.example.util.NumberUtils;

public class Nine {
	public final static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter a number to find factorial ");
		String num = sc.next();
		
		boolean isvalid = NumberUtils.validateNumber(num);
		if(isvalid){
			int number = Integer.parseInt(num);
			System.out.println("factorial of the number is "+NumberUtils.findFactorial(number));
		}
		else
		System.out.println("invalid input");
	}	
	}

