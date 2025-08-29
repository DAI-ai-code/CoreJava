package Assignment5;

public class CheckUpperCase {
	
	public static boolean checkUpperCase(String s1) {
		
		for(char ch: s1.toCharArray()) {
			if (ch > 90) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// upper 65-90
		
		String s1 = "ABC";
		

		System.out.println("Is the string " + s1 + " uppercase? Ans: " + checkUpperCase(s1));
		
		
	}

}
