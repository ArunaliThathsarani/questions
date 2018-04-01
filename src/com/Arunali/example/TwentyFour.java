package com.Arunali.example;
import com.Arunali.example.util.NumberUtils;

public class TwentyFour {
public static void main(String[] args) {
	for(int i=1; i<=1000; i++){
		boolean armstrong=NumberUtils.IsanArmstrong(i);
		if(armstrong)
			System.out.println(i);
	}
	
	
	
	}
}
