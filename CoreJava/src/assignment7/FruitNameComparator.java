package assignment7;

import java.util.Comparator;

public class FruitNameComparator implements Comparator<String> {
	
	public int compare(String obj1, String obj2) {
		return obj2.charAt(0) - obj1.charAt(0); 
	}
}
