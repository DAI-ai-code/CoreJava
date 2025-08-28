package Assignment3;

public class Savings extends Account{
	public	Savings(String accountNum, String name, double balance) {
		super(accountNum, name, balance);
	}
	
	@Override
	public boolean withdraw(double amount) {
		if(this.balance < amount) {
			System.out.println("Not sufficient balance!");
			getBalance();
			return false;
		}
		else {			
			if(this.balance >= 10000) {
				this.balance = this.balance - amount;
			}
			else{
				this.balance = this.balance - amount - 500;
				System.out.println("Extra 500 will be deducted due to low balance!");
			}
		}
		getBalance();
		return true;
	}
	
	
	@Override
	public boolean deposit(double amount) {
		balance = balance + amount;
		getBalance();
		return true;
	}
	
	
	
}
