package book_question;

import java.util.*;
import java.util.stream.Collectors;

public class Library{
	public static List <Book> books = new ArrayList<Book>();
	
	public void bookList() {
		Book b1 = new Book("Mary","Mark twain",1996,2222,true);
        Book b2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 1234, false);
        Book b3 = new Book("1984", "George Orwell", 1949, 5678, true);
        Book b4 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, 9101, false);
        Book b5 = new Book("Pride and Prejudice", "Jane Austen", 1813, 1122, true);
        Book b6 = new Book("Moby Dick", "Herman Melville", 1851, 3344, false);
        Book b7 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951, 5566, true);
		Book b8 = new Book("Sherlock Holmes", "Watson", 1996, 2225, true);
		
		books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        books.add(b6);
        books.add(b7);
        books.add(b8);
		
	}
	
	public void addNewBook(Book b) {
		books.add(b);
	}
	
	public void displayAllBooks() {
		books.stream().forEach(System.out::println);
	}
	
	public Book searchByTitle(String title){
		return books.stream().filter( (b) -> b.getTitle().toLowerCase().equals(title.toLowerCase())).findFirst().orElse(null);
	}
	
	public void borrowBook(int ISBN) throws BorrowedException{
		
		Book book = books.stream().filter((b) -> b.getISBN() == ISBN).findAny().orElse(null);
		if (book.isBorrowed()) {
			throw new BorrowedException("This book is already borrowed!");
		}
		
		book.setBorrowed(true);
		displayAllBooks();
	}
	
	
}
