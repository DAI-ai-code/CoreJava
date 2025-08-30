package Assignment5;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ccf";
		String s2 = "ddd";
		char[] ch = new char[26];
		
		for(int i=0; i<s1.length(); i++) {
			ch[s1.charAt(i)-'a']++;
			ch[s2.charAt(i)-'a']--;
		}
		boolean isAnagram = true;
		for(int i=0; i<26; i++) {
			if(ch[i] != 0) {
				isAnagram = false;
				break;
			}
		}
		
		System.out.println("Are these strings anagram? Ans: " + isAnagram);
		
	}

}
