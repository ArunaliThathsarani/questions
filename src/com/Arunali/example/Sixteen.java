package com.Arunali.example;
import com.Arunali.example.util.NumberUtils;
import java.util.Scanner;

public class Sixteen {
	public final static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the base ");
		String Finput= sc.next();
		System.out.println("Enter the exponent ");
		String Sinput= sc.next();
		boolean isvalid = NumberUtils.validateNumbers(Finput,Sinput);
		if(isvalid){
			int base = Integer.parseInt(Finput);
			int exponent =Integer.parseInt(Sinput);
			System.out.println("power: "+NumberUtils.CalculatePower(base,exponent));
		}
		else
			System.out.println("invalid inputs");
		
		/*int num=2;
		int pow=6;
		int x=1;
		int power=1;
		while(x<=pow){
			power=power*num;
			x++;
		}
		System.out.println(power);	
		
		*/
	}
	
	
}
