package Assignment4;

public class Cookie extends Dessert{
	public Cookie(String flavor, int quantity, double price) {
		super(flavor, quantity, price);
	}

	@Override
	public double calculatePrice() {
		return quantity*price/12;
	}
}
