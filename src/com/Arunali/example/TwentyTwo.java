package com.Arunali.example;
import com.Arunali.example.util.NumberUtils;

public class TwentyTwo {
	public static void main(String[] args) {
		boolean PrimeNumber=NumberUtils.IsaPrimeNumber(7);
		if(PrimeNumber)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
	}
}

