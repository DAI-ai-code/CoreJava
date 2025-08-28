package Assignment4;

public class IceCream extends Dessert {
	
	public IceCream(String flavor, int quantity, double price) {
		super(flavor, quantity, price);
	}

	@Override
	public double calculatePrice() {
		return quantity*price;
	}

}
