package asssignment9;

public class PrintJobber {
	public static void main(String[] args) {
		PrintJob job = new PrintJob();
		Thread t1 = new Thread(job);
		Thread t2 = new Thread(job);
		
		t1.setName("Thread - 1 : ");
		t1.start();
		
		t2.setName("Thread - 2 : ");
		t2.start();
		
	}
}
