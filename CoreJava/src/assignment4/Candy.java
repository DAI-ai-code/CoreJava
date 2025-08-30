package assignment4;

public class Candy extends Dessert{

	public Candy(String flavor, int quantity, double price) {
		super(flavor, quantity, price);
	}

	@Override
	public double calculatePrice() {
		return quantity*price/1000;
	}
}
