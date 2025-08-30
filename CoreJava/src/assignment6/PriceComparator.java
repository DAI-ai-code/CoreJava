package assignment6;
import java.util.Comparator; 

public class PriceComparator implements Comparator<Toy> {
	@Override
	public int compare(Toy t1, Toy t2) {
		return Integer.compare((int)t1.getPrice(), (int)t2.getPrice());
	}
}
