package com.Arunali.example.shape.util;

public final class CircleUtils {
	private CircleUtils(){
		
	}
	/**
	 * Calculate the area of a circle
	 * @param rad radius
	 * @return
	 */
	public static double CalculateArea(double rad){
		return Math.PI*rad*rad;
	}
	
	/**
	 * calculate the perimeter of a circle
	 * @param rad radius
	 * @return
	 */
	public static double CalculatePerimeter(double rad){
		return 2*Math.PI*rad;
	}
	
}
