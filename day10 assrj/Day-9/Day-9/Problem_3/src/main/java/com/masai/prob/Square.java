package com.masai.prob;

import org.springframework.stereotype.Component;

@Component
public class Square {

	
	
	
	
	public int calculateArea(int side) {

		return  4*side;

	}

	public int calculatePerimeter(int side) {

		return  side*side;

	}

	public void draw() {
		System.out.println("Rectangle have drawn...!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
