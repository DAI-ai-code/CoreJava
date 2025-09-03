package asssignment9;

public class Account {
	
	private int balance;
	private int withdrawAmount = 0;
	
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setWithdrawAmount(int amount) {
		withdrawAmount = amount;
	}
	
	public synchronized void deposit(int amount) {
		while(balance<=withdrawAmount) {	
			balance += amount;
			System.out.println("Amount deposited : Rs." + amount + " ---------- Balance: " + balance); 
		}
		notify();
	}
	
	public synchronized void withdraw(int amount) {
		while(balance < amount) {
			System.out.println("Insufficient Funds, please wait till deposit is successful" + " -------- Balance: " +  balance);
			try {
				wait();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= amount;
		System.out.println("Amount withdrawn : Rs." + amount + " ---------- Balance: " + balance);
		

		
		
		
	}
	

}
