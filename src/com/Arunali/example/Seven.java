package com.Arunali.example;
import java.util.Scanner;
import com.Arunali.example.shape.util.RectangleUtils;
import com.Arunali.example.util.NumberUtils;
public class Seven {
	public final static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("enter the length ");
		String firstInput = sc.next();
		
		
		System.out.println("enter the width ");
		String SecondInput = sc.next();
		boolean Isvalid =NumberUtils.validateNumbers(firstInput,SecondInput);
		if(Isvalid ){
			int length =Integer.parseInt(firstInput);
			int width = Integer.parseInt(SecondInput);
			System.out.println("perimeter of the ractangle "+RectangleUtils.CalculatePerimeter(length,width));
		}
		else
		
		System.out.println("invalid inputs" );
	}

}
