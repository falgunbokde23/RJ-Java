package Question1;

public class ThreadImpl1 extends Thread{

	@Override
	
//	public void run(){
	public	synchronized void run() {
		
		for(int i=1; i<=100; i++) {
			
			System.out.println(i);
		}
		
	}
	
	
}
