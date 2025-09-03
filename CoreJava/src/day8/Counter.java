package day8;

public class Counter {

	private int count;
	
	public Counter()
	{
		count =0;
	}
//	public synchronized void increement()
	public void increement()
	{
		count ++;
	}
	
//	public synchronized int getCount()
	public int getCount()
	{
		return count;
	}
}