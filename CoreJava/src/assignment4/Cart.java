package assignment4;

public class Cart {
	protected static int cartItems = 0;
	protected static double cartTotal = 0;

	public static void addToCart(Dessert d) {
		cartItems++;
		cartTotal+=d.calculatePrice();
	}
}
