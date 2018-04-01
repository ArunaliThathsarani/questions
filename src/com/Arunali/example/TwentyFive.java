package com.Arunali.example;
import java.util.Scanner;
import com.Arunali.example.util.NumberUtils;

public class TwentyFive {
	public final static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("Enter the number: ");
	String Input = sc.next();
	
	boolean isvalid = NumberUtils.validateNumber(Input);
	if(isvalid){
		int number=Integer.parseInt(Input);
					for(int i=1;i<=(number/2); i++){
				boolean isaFactor=NumberUtils.IsaFactor(number,i);
				if(isaFactor)
				{
					System.out.println(i);
				}
		}
	}else
		System.out.println("invalid input ");
}
}
