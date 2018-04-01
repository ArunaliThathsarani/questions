package com.Arunali.example.util;
import java.util.ArrayList;
import java.util.Arrays;
public final class NumberUtils {
	private NumberUtils(){
		
	}
	
	/**
	 * validate a number 
	 * @param number
	 * @return boolean
	 */
	
	public static boolean validateNumber(String input){
		boolean isvalid = true;
		if(input==null || input.length()==0){
			isvalid=false;
					}
		else{
			for(int i=0; i<input.length();i++){
				if(!Character.isDigit(input.charAt(i))){
					isvalid =false;
					break;
				}
			}
		}
		return isvalid;
	}
	
	
		
	
	
	
	
	/**
	 * Validate the scanned inputs
	 * @param numbers
	 * @return
	 */
	public static boolean validateNumbers(String... numbers){
		boolean isValid= true;
		for(String number : numbers){
			isValid = validateNumber(number);
			if (!isValid)
				break;
		} return isValid;
		
	}
	
	/**
	 * return sum of numbers
	 * @param numbers
	 * @return
	 */
	public static int sumOfNumbers(int... numbers){
		int sum=0;
		for(int number:numbers){
			sum=sum+number;
		}
		
		return sum;
	}
	
	/**
	 * Returns the largest number
	 * @param numbers
	 * @return
	 */
	public static int largestNumber(int...numbers){
		int largest=numbers[0];
		for(int number: numbers){
			if(number>largest)
				largest=number;
		}
		return largest;
			
	}
	
	/**
	 * Returns the smallest number
	 * @param numbers
	 * @return
	 */
	public static int smallestNumber(int...numbers){
		int smallest = numbers[0];
		for(int number: numbers){
			if(smallest>number)
				smallest= number;
		}
		return smallest;
	}
	
	
	/**
	 * Find the factorial of a given number
	 * @param number
	 * @return
	 */
	
	public static int findFactorial(int number){
		int fact=1;
		for(int i=number; i>=1; i--)
			fact= fact*i;
		return fact;
		
	}
	/**
	 * Reverse a number
	 * @param number
	 * @return
	 */
	
	public static int ReverseNumber(int number){
		int reverse=0;
		while(number!=0){
			reverse= (reverse*10)+number%10;
			number= number/10;
		}
		return reverse;
	}
	/**
	 * Swapping two numbers
	 * @param num1
	 * @param num2
	 */
	
	public static void SwapNumbers(int num1, int num2){
		int extra=num1;
		num1=num2;
		num2=extra;
		System.out.println("after swapping: "+"firstnumber "+ num1+" "+"second number"+num2);
	}
	
	/**
	 * Check whether a given number is even or odd
	 * @param number
	 * @return
	 */
	
	public static String checkEvenOrOdd(int number){
		if(number%2==0)
			return ("even");
		else
			return ("odd");
	}
	
	/**
	 * Calculating  power 
	 * @param exponent
	 * @return
	 */
	public static int CalculatePower(int base, int exponent){
		int power=1;
		for(int i=0; i<exponent; i++){
			power=power*base;
		}
		return power;
	}
	
	/**
	 * Calculating sum of natural numbers
	 * @param number
	 * @return
	 */
	public static int calculateSum(int number){
		int sum=0;
		for(int i=1; i<=number; i++){
			sum= sum+i;
		}
		return sum;
	}
	
	/**
	 * Checking whether a number is Palindrome or not
	 * @param number
	 * @return
	 */
	public static boolean IsaPalindrome(int number){
		boolean palindrome = false;
		int reversedNumber =ReverseNumber(number);
		if(number==reversedNumber){
			palindrome =true;
		}
		return palindrome;
	}
	
	
	/**
	 * Check whether a Number is Prime or not
	 * @param number
	 * @return
	 */
	
	public static boolean IsaPrimeNumber(int number){
		boolean isPrime= true;
		for(int i=2; i<=(number/2); i++){
				if(number%i==0){
				isPrime=false;
				break;}
			}
		return isPrime;
	}
	
	/**
	 * Check a number is Armstrong Number or not
	 * @param number
	 * @return
	 */
	
	public static boolean IsanArmstrong(int number){
		boolean isArmstrong=false;
		int spare =number;
		int armstrong=0;
		while(number!=0){
			int remainder=number%10;
			number= number/10;
			armstrong=armstrong+(remainder*remainder*remainder);}
			if(spare==armstrong)
				isArmstrong=true;
		
		return isArmstrong;
	}
	
	
	public static boolean IsaFactor(int number, int assumptiveFactor){
			boolean isaFactor= false;
			if(number%assumptiveFactor==0){
				isaFactor= true;
			}
		return isaFactor;
	}
	
	
	
	
	
	
	
	
	/**
	 * Convert Any base value to decimal
	 * @param input
	 * @return
	 */
	public static int  AnyBaseToDecimal(int number,int base){
		int digit;
		int decimalNumber=0;
		for(int i=0; number>0; i++){
			digit= number%10;
			decimalNumber=decimalNumber+digit*CalculatePower(base,i);
			number=number/10;
		}
		return decimalNumber;
	}
	/**
	 * Checking validity of number and base
	 * @param base
	 * @param number
	 * @return
	 */
	
	public static boolean checkTheNumber(int base, int number){
		boolean status=true;
		int digit;
		while(number!=0){
			digit= number%10;
			if(digit>base){
				status=false;
				break;
			}
			number=number/10;
		}
		return status;
	}
	
	
	public static void DecimalToAnyBase(int number, int base){
		
		int array[]= new int[number];
		int x=0;
		for(int i=0; number>0;i++){
		 array[i]=number%base;
		 number=number/base;
		 x++;
	}
		for(int i=x-1; i>=0;i--){
			System.out.print(array[i]);
		}
		}
	
	
	
	
	/**
	 * Calculate average of array elements
	 * @param numbers
	 * @return
	 */
	
	public static double CalculateAverage(int...numbers){
		int sum=0;
		double average=0;
		for(int i=0; i<numbers.length; i++){
			sum= sum+numbers[i];
	}
		average=(double)sum/numbers.length;
		return average;
	}
	/**
	 * remove duplicate elements from an array
	 * @param numbers
	 */
	
	public static void RemoveDuplicates(int numbers[]){
		ArrayList arraylist = new ArrayList();
		arraylist.add(numbers[0]);
		for(int i=0; i<numbers.length; i++){
			int element = numbers[i];
			boolean isInsideArraylist=false;
			for(int x=0; x<arraylist.size(); x++){
				if(arraylist.get(x).equals (element)){
					 isInsideArraylist=true;
					 break;
					}
			}
				if(!isInsideArraylist){
					arraylist.add(element);
				}
		}
		System.out.println(arraylist);
	}
	
	/**
	 * check whether a number is positive or negative
	 * @param number
	 * @return
	 */
	
	public static boolean IsaPositiveNumber(int number){
		boolean ISaPositive=true;
		if(number<0)
			ISaPositive=false;
		return ISaPositive;
			
	}
	
	public static int[] reverseArray(int [] array){
		int[] reversedArray=new int[array.length];
		for(int i=0;i<array.length; i++){
			reversedArray[i]=array[array.length-1-i];
		}
		return reversedArray;
	}
	
	
	
}
