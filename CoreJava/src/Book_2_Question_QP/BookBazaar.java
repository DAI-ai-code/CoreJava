package Book_2_Question_QP;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.*;

public class BookBazaar {
	List<Book> books = new ArrayList<>();
//	public Book(String category, LocalDate listingDate, int stock, LocalDate stockUpdateDate, LocalDate lastSellDate, String author, int price, int discount) {

	public void generateBookList() {
		Book b1 = new Book("FICTION", LocalDate.of(2020, 1, 1), 50, LocalDate.of(2025, 1,1), LocalDate.of(2024, 5, 5), "Auther Lang", 500, 10);
		Book b2 = new Book("NON_FICTION", LocalDate.of(2020, 1, 1), 50, LocalDate.of(2022, 1,1), null, "Bala singh", 900, 20);
		Book b3 = new Book("FICTION", LocalDate.of(2022, 12, 1), 50, LocalDate.of(2025, 1,1), LocalDate.of(2025, 9, 5), "Hanna", 5000, 5);
		Book b4 = new Book("NON_FICTION", LocalDate.of(2015, 1, 21), 50, LocalDate.of(2024, 2,1), LocalDate.of(2023, 12, 7), "Monalisa", 1500, 9);
		Book b5 = new Book("EDUCATION", LocalDate.of(2009, 8, 1), 1, LocalDate.of(2025, 3,1), LocalDate.of(2019, 11, 4), "Chris evans", 900, 20);
		Book b6 = new Book("EDUCATION", LocalDate.of(2006, 1, 29), 50, LocalDate.of(2023, 5,1), LocalDate.of(2008, 3, 16), "Autonher strack", 200, 3);
		Book b7 = new Book("FICTION", LocalDate.of(2002, 9, 30), 4, LocalDate.of(2025, 8,1), LocalDate.of(2024, 5, 30), "Mili uwang", 800, 19);
		
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b5);
		books.add(b6);
		books.add(b7);
	}
	
	public void displayeBookList() {
		books.stream().forEach(System.out::println);
	}
	
	public void addNewBook(Book b){
		books.add(b);
		System.out.println("****New Book Added****");
		System.out.println("Book added is: " + b.toString());
	}
	
	public void modifyPrice(int id, int price) {
		Optional<Book> book = books.stream().filter(b -> b.getBookId() == id).findFirst();
		if (book.isPresent()) {
			book.get().setPrice(price);
		}
		System.out.println("Book with id: " + id + " the new price is now: " + price);
	}
	
	public void removeUnsoldBooks() {
		List<Book> unsoldBook = books.stream().filter(b -> b.getLastSellDate() == null && b.getStock() > 0).collect(Collectors.toList());
		
		for (Book b: unsoldBook) {
			System.out.println("We are removing book with ID: " + b.getBookId());
			books.remove(b);
		}
		
		System.out.println("Here is the update book list: ");
		displayeBookList();
		
	}
	
	public List<Book> lowStockBooks() {
		return books.stream().filter(b -> b.getStock() < 5).collect(Collectors.toList());
	}
	
	public void addDiscount() {
		List<Book> discountedBooks =  books.stream().filter( b->  (b.getLastSellDate() != null && (ChronoUnit.MONTHS.between(b.getLastSellDate(), LocalDate.now())) > 6)).collect(Collectors.toList());
		if(discountedBooks.size()>0) {
			for (Book b: discountedBooks) {
				b.setDiscount(25);
			}
			discountedBooks.stream().forEach(System.out::println);
		}else {
			System.out.println("NO BOOKS UNSOLD");
		}
	}

}
