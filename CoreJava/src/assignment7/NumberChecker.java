package assignment7;

import java.util.*;
import java.util.function.Predicate;

public class NumberChecker {
	
	public static int n1, n2;
	
	public static boolean isPrime(int n) {
		
		for(int i = 2; i<n; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean operationOnNumber(Predicate<Integer> p, int n) {
		return p.test(n);
	}
	
	
	public static List<Integer> operationOnNumbers(Predicate<Integer> p, List<Integer> numbers) {
		
		List<Integer> integerList = new ArrayList<Integer>();
		
		for(Integer i : numbers) {
			if(p.test(i)) {
				integerList.add(i);
			}
		}
		
		return integerList;
	}
	
	public static boolean isEven(int n) {
		return n%2 == 0;
	}
	
	public static boolean isDiv(int n) {
		return n%2==0 && n%3==0 && n%5==0;
	}
	
	public static void main(String[] args) {
		n1 = -5;
		n2 = 5;
		
//		ANS 1
		Predicate<Integer> checkPos = (n) -> n>0;
		System.out.println("Is the number " + n1 +" positive? Ans: " + checkPos.test(n1));
		
//		ANS 2
//		Lambda
		Predicate<Integer> isPrime = (n) -> 
		{
				for(int i = 2; i<n; i++) {
					if(n%i == 0) {
						return false;
					}
				}
				return true;
		};
		
		System.out.println("Is the number " + n2 +" prime? (lambda expression) Ans: " + isPrime.test(5));
		
//		method reference
		System.out.println("Is the number " + n2 +" positive? (method reference) Ans: " + operationOnNumber(NumberChecker::isPrime, 5));

		
//		Ans 3 - Part 1
		List<Integer> integerList = List.of(1,2,30,984,15,9844,41,26,69,52,47,59,1,5);
		System.out.println("Even numbers are: " + operationOnNumbers(NumberChecker::isEven, integerList));
		
//		Ans 3 - Part 2
		System.out.println("The numbers divisible by 2,3,5 are: " + operationOnNumbers(NumberChecker::isDiv, integerList));
		
	}

}
