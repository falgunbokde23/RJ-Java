package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.masai.prob.AppRunner;
import com.masai.prob.Circle;
import com.masai.prob.Rectangle;

@SpringBootApplication
public class Problem3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Problem3Application.class, args);
		
		
		AppRunner ar=context.getBean(AppRunner.class);
		
		ar.circleDraw();
		
		ar.rectangleDraw();
		
		
		int  circleArea=ar.circleArea(12);
		System.out.println(circleArea);
		
		int rectangleArea = ar.rectangleArea(12, 10);
		
		System.out.println(rectangleArea);
		

	}

}
