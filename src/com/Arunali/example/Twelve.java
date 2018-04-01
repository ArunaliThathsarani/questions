package com.Arunali.example;
import com.Arunali.example.util.NumberUtils;
import java.util.Scanner;
public class Twelve {
	public final static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter firstInput:");
		String Finput = sc.next();
		System.out.println("enter SecondInput:");
		String Sinput = sc.next();
		boolean isvalid = NumberUtils.validateNumbers(Finput,Sinput);
		if(isvalid){
			int firstNumber = Integer.parseInt(Finput);
			int secondNumber = Integer.parseInt(Sinput);
			System.out.println("before swapping: "+"First number "+firstNumber+" "+"Second number "+secondNumber);
			firstNumber=firstNumber+secondNumber;
			secondNumber=firstNumber-secondNumber;
			firstNumber=firstNumber-secondNumber;
			System.out.println("after swapping: "+"First number "+firstNumber+" "+"Second number "+secondNumber);
		}
		
		else
		System.out.println("invalid input");
}
}
