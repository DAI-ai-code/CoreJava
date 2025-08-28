package Assignment3;

public abstract class Account {
	protected String accountNum;
	protected String name;
	protected double balance;
	public Account(String accountNum, String name, double balance) {
		this.accountNum = accountNum;
		this.balance = balance;
		this.name = name;
	}
	public abstract boolean withdraw(double amount);
	public abstract boolean deposit(double amount);
	
	public void getBalance() {
		System.out.println("Acc num: " + accountNum + "\nName: " + name + "\nBalance: Rs" + balance + "\n");
	}
	
	public static void transaction(Account accountNum1, Account accountNum2, double amount) {
		if(accountNum2.withdraw(amount)) {			
			if(!accountNum1.deposit(amount)) {
				accountNum2.deposit(amount);
			}
		}else {
			System.out.println("Transaction failed!");
		}
		
	}
	
	
	
}
