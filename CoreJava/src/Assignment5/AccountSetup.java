package Assignment5;

import java.util.Scanner;

public class AccountSetup {

	
	public static void main(String args[]) {

		Account a1 = new Account("a1", "a", 10000);

		try {
			a1.deposit(10000000);
			a1.deposit(111);
			a1.withdraw(20.00);
			a1.withdraw(20.00);
			a1.withdraw(20.00);
			a1.withdraw(20.00);
		}
		catch (InvalidDenominationException e){
			System.out.println("Error: " + e.getMessage());
		}
		catch(DepositLimitException e) {
			System.out.println("Error: " + e.getMessage());
		}
		catch(InsufficientBalanceException e) {
			System.out.println("Error: " + e.getMessage());
		}
		catch(WithdrawalLimitException e) {
			System.out.println("Error: " + e.getMessage());
		}
		catch(WithdrawalCountException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		
	}
}
