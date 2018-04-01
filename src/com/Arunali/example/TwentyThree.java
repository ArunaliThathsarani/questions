package com.Arunali.example;
import com.Arunali.example.util.NumberUtils;

public class TwentyThree {
public static void main(String[] args) {
	int firstLimit =1;
	int lastLimit=10;
	for(int i=firstLimit; i<=lastLimit; i++){
		if(NumberUtils.IsaPrimeNumber(i)){
			System.out.println(i);
		}
	}
}
}
