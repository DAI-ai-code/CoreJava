package Book_2_Question_QP;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Tester {
	public static BookBazaar store = new BookBazaar();
	static Scanner ss = new Scanner(System.in);
	
	public static void userAddNewBook() throws IllegalArgumentException{
		try {
		System.out.println("Enter Category: ");
		String category = ss.nextLine();
		
		System.out.println("Enter stock: ");
		int stock = ss.nextInt();
		ss.nextLine();
		
		System.out.println("Enter author: ");
		String author = ss.nextLine();
		
		System.out.println("Enter price: ");
		int price = ss.nextInt();
		ss.nextLine();
		
		System.out.println("Enter discount: ");
		int discount = ss.nextInt();
		ss.nextLine();
		
		Book newBook = new Book(category, LocalDate.now(), stock, LocalDate.now(), null, author, price, discount);
		store.addNewBook(newBook);
		} 
		catch(IllegalArgumentException e) {
			System.out.println("Please enter category among: FICTION/NON_FICTION/EDUCATION only!");
		}
		
		
	}
	
	public static void userModifyPrice() {
		System.out.println("Enter the book ID whose price you want to modify: ");
		int id = ss.nextInt();
		ss.nextLine();
		System.out.println("Enter new price: ");
		int newPrice = ss.nextInt();
		ss.nextLine();
		
		store.modifyPrice(id, newPrice);
	}

	public static void main(String[] args) {
		store.generateBookList();
		
//		Answer 1
//		To add a new book we have a function in this class to keep the main program clean! 
//		It calls the utils i.e. Book Bazaar funciton
		System.out.println("---------ANSWER 1-----------");
		userAddNewBook();
		
//		Answer 2
//		To modify a book price we have a function in this class to keep the main program clean! 
//		It calls the modifyFunciton in the utils i.e. BookBazar file
		System.out.println("---------ANSWER 2-----------");
		userModifyPrice();
		
//		Answer 3
//		Since this doesn't need a use input we call from utils directly
		System.out.println("---------ANSWER 3-----------");
		store.removeUnsoldBooks();
		
//		Answer 4
		System.out.println("---------ANSWER 4-----------");
		List<Book> books = store.lowStockBooks();
		for(Book b: books) {
			System.out.println(b.toString());
		}
		
//		Answer 5
		store.addDiscount();
		
//		System.out.println(LocalDate.of(2024, 6, 6).until(LocalDate.now()).getYears() + " " + (LocalDate.of(2024, 6, 6).until(LocalDate.now()).getMonths()));
		
	}

}
