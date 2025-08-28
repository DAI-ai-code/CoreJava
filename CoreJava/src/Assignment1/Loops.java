package Assignment1;

public class Loops {

	public static boolean isPrime(int number) {
		for(int i=2; i<number; i++) {
			if (number%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static int factorial(int number) {
		int ans = 1;
		for(int i=1;i<=number;i++) {
			ans = ans*i;
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		
		int prime_num = 11;
		boolean answer = isPrime(prime_num);
		System.out.println("Is " + prime_num +" prime? Ans: " + answer);
       
		int factorial_num = 5;
		int factorialAns = factorial(factorial_num);
		System.out.println("Factorial of "+factorial_num+" = " + factorialAns);
	}

}