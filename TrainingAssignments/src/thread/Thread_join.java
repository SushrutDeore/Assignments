package thread;

public class Thread_join extends Thread {
	
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println(i+" "+getName());
			
		}
	}
	
	
	public static void main(String[] args) {
		
		Thread_join t1=new Thread_join();
		Thread_join t2=new Thread_join();
		Thread_join t3=new Thread_join();
		
		t1.run();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
		t3.start();
	}

}
