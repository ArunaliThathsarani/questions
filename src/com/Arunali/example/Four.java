package com.Arunali.example;
import java.util.Scanner;

import com.Arunali.example.shape.util.CircleUtils;
import com.Arunali.example.util.NumberUtils;

public class Four {
	public final static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the radius");
		String rad= sc.next();
		
		boolean isvalid=NumberUtils.validateNumber(rad);
		if(isvalid){
			double radius =Integer.parseInt(rad);
			System.out.println("area of the circle "+CircleUtils.CalculateArea(radius));
		}
		else
			System.out.println("invalid input");
}
}
