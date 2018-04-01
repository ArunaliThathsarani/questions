package com.Arunali.example;
import com.Arunali.example.util.NumberUtils;

public class ThirtySix {
public static void main(String[] args) {
	
int array[] ={12,5,11,8,16,2};
int reversedArray[]= new int[array.length];
reversedArray=NumberUtils.reverseArray(array);
for(int i=0; i<reversedArray.length; i++){
	System.out.println(reversedArray[i]);
}
}
}
