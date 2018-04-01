package com.Arunali.example;
import java.util.Scanner;
import com.Arunali.example.util.NumberUtils;
import com.Arunali.example.shape.util.RectangleUtils;
public class Six {
	public  static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the length :");
		String firstInput= sc.next();
				
		System.out.println("Enter the width :");
		String secondInput =sc.next();						
		boolean isValid = NumberUtils.validateNumbers(firstInput,secondInput);
		
		if(isValid){
			int length=Integer.parseInt(firstInput);
			int width =Integer.parseInt(secondInput);
			System.out.println("Rectangle Area is "+RectangleUtils.CalculateRectArea(length, width));
		}
		else
		System.out.println("invalid inputs ");
		
	}
}
