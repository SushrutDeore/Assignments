package thread;

public class threadTimer extends Thread {
	
	int hour,min,sec;
	
	public threadTimer(int hour,int min,int sec)
	{
		this.hour=hour;
		this.min=min;
		this.sec=sec;
	}
	
	public void run()
	{
		int inSeconds=(this.hour*3600)+(this.min*60)+this.sec;
		
		while(inSeconds!=0)
		{
			inSeconds--;
			try
			{
				sleep((long)(Math.random()*1000));
				
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(inSeconds);
		
		}
			System.out.println("Times Up");
	}

	
	public static void main(String[] args) {
		
		new threadTimer(0, 0, 21).run();
		
		
	}
}
