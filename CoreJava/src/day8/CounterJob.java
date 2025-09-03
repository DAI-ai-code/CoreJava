package day8;

public class CounterJob implements Runnable{

	Counter c;
	
	public CounterJob()
	{
		c = new Counter();
	}
	@Override
	public void run() {
		for(int i=0; i<10;i++)
		{
//			synchronized(c)
//			{
				c.increement();
				System.out.println("Count :" +c.getCount() +" " + Thread.currentThread().getName());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
//		}	
	}

}