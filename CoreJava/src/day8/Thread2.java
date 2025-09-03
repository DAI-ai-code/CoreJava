package day8;

public class Thread2 extends Thread{

	public void run()
	{
		for(int i=0; i<5;i++)
		{
			System.out.println(Thread.currentThread().getName() + " :" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}