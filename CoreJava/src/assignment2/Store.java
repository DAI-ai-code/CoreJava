package assignment2;

public class Store {
	
	public static void displayProductList(Product[] list) {
		for(Product p: list) {
			System.out.println(p);
		}
	}
	
	public static int findProduct(Product[] list, int id) {
		int start = 0;
		int end = list.length;
		while(start<end) {
			int mid = (start+end)/2;
			if(list[mid].getId() == id) {
				return mid;
			}
			if(list[mid].getId() > id) {
				end = mid-1;
			}else {
				start=mid+1;
			}
		}
		return -1;
	}
	
}
