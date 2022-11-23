package Question1;

public class ThreadImpl2 implements Runnable{

	
	
	@Override
//	public void run() {
	
	public	synchronized void run() {
for(int i=1; i<=100; i++) {
			
			System.out.println(i);
		}
		
	}

}
