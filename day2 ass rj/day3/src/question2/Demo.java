package question2;

import question1.main;

public class Demo implements main1,main2{

	
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.play();
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		main1.super.play();
	}

}
