package com.Arunali.example;
import com.Arunali.example.util.NumberUtils;
import java.util.Scanner;

public class Seventeen {
	public final static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the last natural number: ");
		String input = sc.next();
		boolean isvalid=NumberUtils.validateNumbers(input);
		if(isvalid){
			int limit = Integer.parseInt(input);
			System.out.println("sum of numbers up to "+limit+" is= "+NumberUtils.calculateSum(limit));
		}
		else
			System.out.println("invalid input"); 
		}
	
}

