package com.Arunali.example;
import java.util.Scanner;
import com.Arunali.example.util.NumberUtils;

public class TwentySix {
	private final static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("Enter the number");
	String input=sc.next();
	
	boolean isvalid=NumberUtils.validateNumber(input);
	if(isvalid){
		int number =Integer.parseInt(input);
		int fn,sn;
		for(int i=1; i<=number/2; i++){
			fn=i;
			sn=number-i;
			if(NumberUtils.IsaPrimeNumber(fn)&&NumberUtils.IsaPrimeNumber(sn))
				System.out.println(+fn+" + "+sn);
		}
	}
	else
		System.out.println("invalid input");
}
}
