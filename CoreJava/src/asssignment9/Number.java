package asssignment9;

public class Number {
	
	private int n = 1;
	
	public synchronized void isOdd() {
		if(n%2 != 0) {
			System.out.println(Thread.currentThread().getName() + "  : " + n);
			n++;
			notify();
		}
		else {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public int getN() {
		return n;
	}

	public synchronized void isEven() {
		if(n%2 == 0) {
			System.out.println(Thread.currentThread().getName() + " : " + n);
			notify();
			n++;
		}
		else {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
