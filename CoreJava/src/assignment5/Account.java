package assignment5;

public class Account {
	protected String accountNum;
	protected String name;
	protected double balance;
	protected int withdrawalLimit = 50000;
	protected int denominationFactor = 50;
	protected int maxWithdrawalCount = 3;
	protected int withdrawalCount = 1;
	protected int depositLimit = 1500000;
	
	public Account(String accountNum, String name, double balance) {
		this.accountNum = accountNum;
		this.balance = balance;
		this.name = name;
	}
	
	public void withdraw(double amount) throws InsufficientBalanceException, WithdrawalLimitException, WithdrawalCountException {
		
		if(withdrawalCount > maxWithdrawalCount) {
			throw new WithdrawalCountException("You cannot withdraw more than " + maxWithdrawalCount + " times a day!"
					+"\nPlease wait for 24 hours.");
		}
		
		if(amount > withdrawalLimit) {
			throw new WithdrawalLimitException("The withrawal limit is: Rs. " + withdrawalLimit);
		}			
		
		if(balance < amount) {
			throw new InsufficientBalanceException("Low Balance!");
		}			
		
		
		++withdrawalCount;
		balance -= amount;	
		System.out.println("Amount withdrawn: Rs. " + amount+ "\nBalance left: Rs. " + balance + "\n");
	}
	
	public void deposit(double amount) throws InvalidDenominationException, DepositLimitException{
		if(amount > depositLimit) {
			throw new DepositLimitException("The deposit limit is: Rs. " + depositLimit);
		}
		if(amount%denominationFactor != 0) {
			throw new InvalidDenominationException("Deposits can be made only in denominations of Rs. " + denominationFactor);
		}
		balance += amount;
	}
	
	public void getBalance() {
		System.out.println("Acc num: " + accountNum + "\nName: " + name + "\nBalance: Rs" + balance + "\n");
	}
	
	
	
	
	
	
}
