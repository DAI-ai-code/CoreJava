package asssignment9;

public class AccountSetup {
	

	public static void main(String[] args) {
		int depositAmount = 4000;
		int withdrawAmount = 50000;
		
		
		Account a1 = new Account(0);
		a1.setWithdrawAmount(withdrawAmount);
		
		Thread depositThread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(800);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				a1.deposit(depositAmount);
			}
		});
		
		Thread withdrawThread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				a1.withdraw(withdrawAmount);
			}
		});
		
		withdrawThread.setName("Withdraw");
		withdrawThread.start();
		depositThread.setName("Deposit");
		depositThread.start();
		
		
		
		
	}
}
