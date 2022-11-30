package com.masai.prob;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape{

	public int calculateArea(int radious) {

		return (int) (radious * radious * 3.14);

	}

	public int calculatePerimeter(int rad) {

		return (int) (2 * rad * 3.14);

	}

	public void draw() {
		System.out.println("Circle have drawn...!");
	}

}
