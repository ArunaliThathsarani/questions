package com.Arunali.example;

import com.Arunali.example.util.NumberUtils;

public class ThirtyThree {
public static void main(String[] args) {
	int limit=100;
	int noOfPrime=0;
		for(int i=1;true; i++){
			if(NumberUtils.IsaPrimeNumber(i)){
				System.out.println(i);
				noOfPrime++;
			}
			if(noOfPrime==limit)
				break;
				
		}
	
		
}
}
