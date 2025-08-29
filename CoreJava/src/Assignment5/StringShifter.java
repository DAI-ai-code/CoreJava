package Assignment5;

public class StringShifter {

	public static void main(String[] args) {
		
		String s1 = "abcABCDE";
		int shiftBy = 200;
		int n = s1.length();
		shiftBy = 200 % n;
		
		
		for(int i = 0; i<shiftBy; i++) {
			char c = s1.charAt(0);
			s1 = s1.substring(1) + c; 
		}
		System.out.println(s1);

	}

}
