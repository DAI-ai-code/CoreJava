package Book_2_Question_QP;

import java.time.LocalDate;

public class Book {
	private static int id = 0;
	private Category category;
	private LocalDate listingDate;
	private int stock;
	private LocalDate stockUpdateDate;
	private LocalDate lastSellDate;
	private String author;
	private int price;
	private int discount;
	private int bookId;
	
	
	public Book(String category, LocalDate listingDate, int stock, LocalDate stockUpdateDate, LocalDate lastSellDate, String author, int price, int discount) {
		this.category = Category.valueOf(category);
		this.listingDate = listingDate;
		this.stock = stock;
		this.stockUpdateDate = stockUpdateDate;
		this.lastSellDate = lastSellDate;
		this.author = author;
		this.price = price;
		this.discount = discount;
		this.bookId = ++id;
	}
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
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
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	@Override
	public String toString() {
		return "Book bookId= " + bookId + ", category=" + category + ", listingDate=" + listingDate + ", stock=" + stock + ", stockUpdateDate="
				+ stockUpdateDate + ", lastSellDate=" + lastSellDate + ", author=" + author + ", price=" + price
				+ ", discount=" + discount;
	}
	
	
	
}
