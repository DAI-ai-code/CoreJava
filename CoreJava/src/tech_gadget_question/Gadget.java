package tech_gadget_question;

import java.time.LocalDate;

public class Gadget {
	private static int id = 0;
	private LocalDate listingDate;
	private int stock;
	private LocalDate stockUpdateDate;
	private LocalDate lastSellDate;
	private String brand;
	private int price;
	private int discount;
	private Category category;
	private int gadId;
	
	
	
	public Gadget(LocalDate listingDate, int stock, LocalDate stockUpdateDate, LocalDate lastSellDate, String brand, int price, int discount, String category) {
		this.gadId = ++id;
		this.listingDate = listingDate;
		this.stock = stock;
		this.stockUpdateDate = stockUpdateDate;
		this.lastSellDate = lastSellDate;
		this.brand = brand;
		this.price = price;
		this.discount = discount;
		this.category = Category.valueOf(category);
	}
	public int getId() {
		return gadId;
	}
	public static void setId(int id) {
		Gadget.id = id;
	}
	public LocalDate getListingDate() {
		return listingDate;
	}
	public void setListingDate(LocalDate listingDate) {
		this.listingDate = listingDate;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}
	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}
	public LocalDate getLastSellDate() {
		return lastSellDate;
	}
	public void setLastSellDate(LocalDate lastSellDate) {
		this.lastSellDate = lastSellDate;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Gadget  ID: " + gadId + ", listingDate=" + listingDate + ", stock=" + stock + ", stockUpdateDate=" + stockUpdateDate
				+ ", lastSellDate=" + lastSellDate + ", brand=" + brand + ", price=" + price + ", discount=" + discount
				+ ", category=" + category;
	}
	
	
}
