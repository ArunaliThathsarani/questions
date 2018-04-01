package com.Arunali.example.shape.util;

public final class RectangleUtils {
	private RectangleUtils(){
		
	}
	public static int CalculateRectArea(int length, int width){
		return length*width;
	}
	
	
	public static int CalculatePerimeter(int length, int width){
		return (2*length)+(2*width);
	}
	
	
	
}
