package com.masai;

public class Rectangle implements Shape {

	
	
	public int calculateArea(int length,int width) {

		return  length*width;

	}

	public int calculatePerimeter(int length,int width) {

		return  2 *(length*width);

	}

	public void draw() {
		System.out.println("Rectangle have drawn...!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
