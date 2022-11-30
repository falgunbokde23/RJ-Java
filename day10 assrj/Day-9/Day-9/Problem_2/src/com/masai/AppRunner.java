package com.masai;

public class AppRunner {

	
	
	
	
	
	public static void main(String[] args) {
		
		
	   Shape shape = new Circle();
	   
	   ((Circle) shape).draw();
	   
	   
	  System.out.println(((Circle) shape).calculateArea(10));
	 
		
	   Shape shape1 = new Rectangle();
		
		((Rectangle)shape1).draw();
		
		
		System.out.println(((Rectangle)shape1).calculatePerimeter(12, 10));
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
