package com.Arunali.example;
import java.util.Scanner;
import com.Arunali.example.util.NumberUtils;

public class Thirteen {
	public final static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("enter the number to divide");
	String Finput= sc.next();
	
	System.out.println("enter the divider");
	String Sinput= sc.next();
	boolean isvalid = NumberUtils.validateNumbers(Finput,Sinput);
	if(isvalid){
		int number = Integer.parseInt(Finput);
		int divider= Integer.parseInt(Sinput);
		System.out.println("quotient is "+( number/divider));
		System.out.println("remainder is "+( number%divider));
	}
	
		
}
}
