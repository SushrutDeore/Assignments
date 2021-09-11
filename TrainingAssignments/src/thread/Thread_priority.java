package thread;

public class Thread_priority extends Thread{
	
	public void run()
	{
		System.out.println("Thread Running..."+getName());
	}

	public static void main(String[] args) {
		
		Thread_priority t1=new Thread_priority();
		Thread_priority t2=new Thread_priority();
		
		System.out.println("Thread min priority: "+Thread.MIN_PRIORITY);
		System.out.println("Thread max priority: "+Thread.MAX_PRIORITY);
		System.out.println("Thread normal priority: "+Thread.NORM_PRIORITY);
		System.out.println("Thread 0 priority:"+t1.getPriority());
		System.out.println("Thread 1 priority:"+t2.getPriority());
		t1.setPriority(7);
		t2.setPriority(10);
		System.out.println("Thread 0 priority:"+t1.getPriority());
		System.out.println("Thread 1 priority:"+t2.getPriority());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.start();
		t2.start();
		
	}
}
