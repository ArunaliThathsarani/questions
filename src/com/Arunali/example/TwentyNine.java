package com.Arunali.example;
import java.util.Scanner;

import com.Arunali.example.util.NumberUtils;

public class TwentyNine {
	private final static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		int array[]= new int[10];
		System.out.println("enter array elements");
		for(int i =0; i<array.length; i++){
			String Input= sc.next();
			if(NumberUtils.validateNumber(Input)){
				int element=Integer.parseInt(Input);
				array[i]= element;
			}
			else
				System.out.println("invalid input");
			
		}
		System.out.println("the largest element of array "+NumberUtils.largestNumber(array));
	}
}
