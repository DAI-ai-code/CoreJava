package assignment3;

public class Current extends Account{
	
	public Current(String accountNum, String name, double balance) {
		super(accountNum, name, balance);
	}
	
	@Override
	public boolean withdraw(double amount) {
		if(balance < amount) {
			System.out.println("Low balance!");
			getBalance();
			return false;
		}
		else {
			if(amount > 50000) {
				System.out.println("Max. withdrawal limit is 50000!");
			}
			else {
				balance = balance - amount;
			}
		}
		getBalance();
		return true;
	}
	
	@Override
	public boolean deposit(double amount) {
		if(amount % 50 != 0) {
			System.out.println("Deposit amount must be in denominations of Rs 50!");
			getBalance();
			return false;
		}
		else {
			balance += amount;
		}
		getBalance();
		return true;
	}
}
