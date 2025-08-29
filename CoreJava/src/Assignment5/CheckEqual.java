package Assignment5;

import java.util.Scanner;

public class CheckEqual {
	
	public static boolean equalIgnoreCase(String s1, String s2) {
		
		for(int i=0; i<s1.length(); i++) {
			
			if(s1.charAt(i) != s2.charAt(i)) {
				if(s1.charAt(i)<s2.charAt(i)) {
					if(s1.charAt(i)+32 != s2.charAt(i)) {
						return false;
					}
				}else {
					if(s1.charAt(i)-32 != s2.charAt(i)) {
						return false;
					}
				}
			}
			
		}
		return true;
	}
	
	public static boolean equal(String s1, String s2) {
		
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String: ");
		s1 = sc.next();
		System.out.println("Enter second String: ");
		s2 = sc.next();

		System.out.println("Are the two strings equal? Ans: " + equalIgnoreCase(s1, s2));
		
	
	}

}
