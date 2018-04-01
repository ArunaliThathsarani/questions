package com.Arunali.example;
import java.util.Scanner;
import com.Arunali.example.util.NumberUtils;
import com.Arunali.example.shape.util.CircleUtils;

public class Five {
	public final static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the radius :");
		String input = sc.next();
		
		boolean isvalid = NumberUtils.validateNumber(input);
		if(isvalid){
			double radius = Integer.parseInt(input);
			System.out.println("the perimeter is "+CircleUtils.CalculatePerimeter(radius));
		}
		else
		System.out.println("invalid input");
		
	}
}
