package Assignment3;

import java.util.Scanner;

public class AccountSetup {
	
	public static Account findAccount(Account[] list, String accNum) {
		for(Account a: list) {
			if(a.accountNum == accNum) {
				return a;
			}
		}
		return new Savings(null, null, 0);
}
	
	public static void main(String args[]) {
		Savings s1 = new Savings("S1", "Nam", 1500);
		Current c1 = new Current("C1", "Aam", 0);
		Savings s2 = new Savings("S2", "Ram", 400000);
		Current c2 = new Current("C2", "Shyam", 200000);
		Savings s3 = new Savings("S3", "Kam", 150000);
		Current c3 = new Current("C3", "Dam", 185000);
		
		Account[] list = {s1,s2,s3,c1,c2,c3};

	
		Scanner sc = new Scanner(System.in);
		String accNum2 = "S2";
		System.out.println("Enter account number from which you want to withdraw: " + accNum2);
		String accNum1 = "C24";
		System.out.println("Enter account number into which you want to deposit: "+ accNum1);
		
		Account a1 = findAccount(list,accNum1);
		Account a2 = findAccount(list,accNum2);
		
		System.out.println("Enter amount: ");
	    int amount = sc.nextInt();
	    
	    if(a1.accountNum != null && a2.accountNum !=null) {
	    	Account.transaction(a1,a2,amount);
	    }
	    else {
	    	System.out.println("Account does not exist!");
	    }
		
	}
}
