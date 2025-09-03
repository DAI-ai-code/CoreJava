package day8;

public class DemoThreads02 {

	public static void main(String[] args) {
		Counter c = new Counter();
		new Thread(new Runnable() {			
			@Override
			public void run() {
//				synchronized (c)
				{
					for(int i=0; i<10;i++)
					{
						c.increement();
						System.out.println("Count :" +c.getCount() + "main - 1");
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				
			}
		}).start();
		
		new Thread(new Runnable() {		
			
			@Override
			public void run() {
//				synchronized(c)
				{
					for(int i=0; i<10;i++)
					{
						c.increement();
						System.out.println("Count :" +c.getCount() + "main - 2");
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}	
				}
			}
		}).start();

		CounterJob job = new CounterJob();
		Thread t1 = new Thread(job);
		Thread t2 = new Thread(job);
		
		t1.start();
		t2.start();
	}

}