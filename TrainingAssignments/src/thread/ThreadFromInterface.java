package thread;

public class ThreadFromInterface  implements Runnable{

	@Override
	public void run() {
		
			System.out.println("Thread is running");
		
		
	}
	
	public static void main(String[] args) {
		
		ThreadFromInterface t=new ThreadFromInterface();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		t1.start();
		t2.start();
		
	}
	
	


}
