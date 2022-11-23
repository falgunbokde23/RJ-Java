package Question1;

public class Test {

	public static void main(String[] args) {
		
		
		ThreadImpl1 tr=new ThreadImpl1();
		tr.start();
		
		
		ThreadImpl2 tr2=new ThreadImpl2();
		Thread trd=new Thread(tr2);
		trd.start();
	}
}
