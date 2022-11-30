package com.masai.prob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppRunner {

	@Autowired
	private  Circle c;
	
	private Rectangle r;
	
	
    @Autowired
	public AppRunner(Rectangle r) {
		super();
		this.r = r;
	}



	public  int  circleArea (int n) {
		
    return  c.calculateArea(n);

		
	}
	
	
	public  void  circleDraw () {
		
	      c.draw();

			
		}
	
	
	public  int  rectangleArea (int a,int b) {
		
	    return  r.calculateArea(a,b);

			
		}
		
		
		public  void  rectangleDraw () {
			
		      r.draw();

				
			}
	
	
	
	
}
