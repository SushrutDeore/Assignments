package thread;

public class threadDemo extends Thread{
	
	public String title;
	
	public threadDemo(String str)
	{
		this.title=str;
	}
	
	public void run()
	{
		
		for(int i=0;i<5;i++)
			System.out.println(i+" : "+title);
			try
			{
				sleep((long)(Math.random()*1000));
				
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("Done...! "+getName());
	}
	
	
	public static void main(String[] args) {
		
		new threadDemo("First").run();
		new threadDemo("Secoond").run();
		
	}

}
