package assignment2;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Product list[] = {new Product("Apple", 120), 
				new Product("Banana", 20), 
				new Product("Pear", 100), 
				new Product("Kiwi", 220),
				new Product("Avacado", 280)};
		
		Store.displayProductList(list);
		System.out.println("Enter the product ID:");
		int pId = sc.nextInt();
		int res = Store.findProduct(list, pId);
		if(res!=-1) {
			System.out.println("It is at index: " + res);
		}else {
			System.out.println("It does not exist! :(");
		}
	}
}
