package assignment6;

public class Toy implements Comparable<Toy>{
	
	private String productId, name, category;
	private double price;
	private int age, year;
	
	public Toy(String productId, double price,  String name, String category, int age, int year) {
		this.productId = productId;
		this.price = price;
		this.name = name;
		this.category = category;
		this.age = age;
		this.year = year;
	}

	public String getProductId() {
		return productId;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCategory() {
		return category;
	}

	public int getAge() {
		return age;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "productId=" + productId + ", name=" + name + ", category=" + category + ", price=" + price
				+ ", age=" + age + ", year=" + year + "\n";
	}
	
	@Override
	public int compareTo(Toy o) {
		return o.getCategory().compareTo(this.category);
	}
	
	
	
	
}
