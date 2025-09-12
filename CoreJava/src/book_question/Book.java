package book_question;

public class Book {
	private String title;
	private String author;
	private int year;
	private int ISBN;
	private boolean borrowed;
	
	public Book(String title, String author, int year, int ISBN, Boolean borrowed) {
		this.title = title;
		this.author = author;
		this.year = year;
		this.ISBN = ISBN;
		this.borrowed = borrowed;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public boolean isBorrowed() {
		return borrowed;
	}

	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}
	
	public String toString() {
		return "Book title: "+ title + " author: " + author + " year: "+ year +" ISBN: " + ISBN + " Borrowed: " + borrowed;
	}
}
