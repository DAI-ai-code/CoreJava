package assignment6;

import java.util.Comparator;

public class ProductIdComparator implements Comparator<Toy>{
	
	@Override
	public  int compare(Toy t1, Toy t2) {
		return t1.getProductId().compareTo(t2.getProductId());
	}

}

