package com.masai;

public class AppRunner {

	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		ShapeDrawer sD=new ShapeDrawer(new Rectangle());
		sD.invokeDrawMethod();
	    
		
		
		
		ShapeAreaCalculator sAc = new ShapeAreaCalculator(new Rectangle());
		
		int ans =sAc.invokeCalculateArea(10, 12);
		System.out.println(ans);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
