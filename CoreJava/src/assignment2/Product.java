package assignment2;

public class Product {
	private static int id = 0;
    private String name;
    private int price;
    private int productId;
	
    public Product(String name, int price) {
		this.productId = ++id;
		this.name = name;
		this.price = price;
	}
	
    public String toString() {
    	return "Product ID: " + productId + " ,Product Name: " + name + " ,Price: " + price;
    }
    public int getId() {
    	return productId;
    }
}
