package assignment4;

import java.util.Scanner;

public class Store {
	
	static String items = "";
	public static void bill() {
		System.out.println("----------------------BILL---------------------");
		System.out.println(items);
		System.out.println("Total number of items: " + Cart.cartItems);
		System.out.println("Your total amount is: Rs. " + Cart.cartTotal);
		System.out.println("-----------------------------------------------");
		System.out.println("Thank you for shopping with us!");
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dessert Menu");
		System.out.println("1. Candy\n2. Cookie\n3. Ice Cream");
		System.out.println("What do you want to buy?\n(Enter choice 1-3 to buy.)");
		int choice = sc.nextInt();
		
		
		while(choice == 1 || choice == 2 || choice == 3) {
			System.out.println("Which flavor do you want?");
			String flavor = sc.next();
			System.out.println("Enter Price: ");
			double price = sc.nextDouble();
			System.out.println("Enter Quantity: ");
			int quantity = sc.nextInt();
			
		switch(choice) {
		case 1: 
			Candy candy = new Candy(flavor,quantity,price);
			Cart.addToCart(candy);
			items+="Candy: " + quantity + ", flavour: "+ flavor+ ", price: " + candy.calculatePrice()+"\n";
			break;
		case 2:
			Cookie cookie = new Cookie(flavor,quantity,price);
			Cart.addToCart(cookie);
			items+="Cookie: " + quantity + " flavour: "+ flavor+ ", price: " + cookie.calculatePrice()+"\n";
			break;
		case 3:
			IceCream icecream = new IceCream(flavor, quantity, price);
			Cart.addToCart(icecream);
			items+="Ice Cream: " + quantity + " flavour: "+ flavor+ ", price: " + icecream.calculatePrice()+"\n";
			break;
		}
		System.out.println("Want something else?\n(Enter choice 1-3 to buy and any other value to exit)");
		choice = sc.nextInt();
		}
		
		bill();
	}
	
	
}
