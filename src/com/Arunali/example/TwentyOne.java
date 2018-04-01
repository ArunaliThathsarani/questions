package com.Arunali.example;
import com.Arunali.example.util.NumberUtils;

public class TwentyOne {
public static void main(String[] args) {
	int number=3265;
	boolean isaPalindrome = NumberUtils.IsaPalindrome(number);
	if(isaPalindrome){
		System.out.println("number is a Palindrome");
	}
	else
		System.out.println("number is not a Palindrome");
		}
	}
	
