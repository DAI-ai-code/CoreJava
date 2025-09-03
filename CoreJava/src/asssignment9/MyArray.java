package asssignment9;

public class MyArray {
	int[] arr = {10,20,30,40};
	public synchronized void printArray() {
		for(int i: arr) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}
