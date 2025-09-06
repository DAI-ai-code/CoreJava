package asssignment9;

public class OddEven {

	public static void main(String[] args) {
		
		Number num = new Number();

		Thread even = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				while(num.getN() < 11 ) {	
					num.isEven();
				}
			}
		});
		
		Thread odd = new Thread(new Runnable() {
			@Override
			public void run() {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while(num.getN() < 11) {
				num.isOdd();
			}
			}
		});
		
		even.setName("Even Thread");
		odd.setName("Odd Thread");
		even.start();
		odd.start();

	}

}
