package Assignment5;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Silent";
		String s2 = "Listen";
		int sum1=0,sum2 = 0;
		for(int i=0; i<s1.length(); i++) {
			sum1 += s1.toLowerCase().charAt(i);
			sum2 += s2.toLowerCase().charAt(i);
		}
		if(sum1 == sum2) {
			System.out.println("They are anagram");
		}else {
			System.out.println("They are not");
		}
	}

}
