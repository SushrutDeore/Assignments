package thread;

public class Thread_yeild extends Thread {
	String title;
	
	public Thread_yeild(String str)
	{
		this.title=str;
	}
	
	public void run()
	{
		
		for(int i=0;i<5;i++)
		{
			System.out.println(i+" : "+title);
			try
			{
				sleep((long)(Math.random()*1000));
				Thread.yield();
				
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("Done...! "+getName());
		}
	}
	
	
	public static void main(String[] args) {
		
		new Thread_yeild("First").start();
		new Thread_yeild("Second").start();
		
	}

}
