package Assignment4;

public abstract class Dessert {
	protected String flavor;
	protected int quantity;
	protected double price;
	
	public Dessert(String flavor, int quantity, double price) {
		this.flavor = flavor;
		this.quantity = quantity;
		this.price = price;
	}
	
	public abstract double calculatePrice();

}
