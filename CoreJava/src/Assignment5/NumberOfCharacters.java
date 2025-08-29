package Assignment5;

public class NumberOfCharacters {

	public static void main(String[] args) {
		// Lower: 97-122
        // Upper: 65-90		
		// 33-47 58-64 91-96 123-126 upto 127
		// 0-32  not needed
//		48-57 not needed
		
		int lowerCount = 0, upperCount = 0, specialCharCount = 0;
		
		String s1 = "hel+-=-0-9-0=lo@&^*&^*123#HELLO";
		
		for(char c : s1.toCharArray()) {
			int ch = (int)c;
			if((ch>=33 && ch<=47) || (ch>=58 && ch<=64) || (ch>=91 && ch<=96) || (ch>=123 && ch<=127)) {
				specialCharCount++;
			}else if(ch>=97 && ch<=122) {
				lowerCount++;
			}else if(ch>=65 && ch<=90) {
				upperCount++;
			}
		}
		System.out.println("Upper: " + upperCount + "\nLower: " + lowerCount + "\nSpecial characters: " + specialCharCount);
		
		
	}

}
