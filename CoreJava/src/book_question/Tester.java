package book_question;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Library lib = new Library();
		lib.bookList();
		lib.displayAllBooks();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the title: ");
		String title = sc.nextLine();
		System.out.println(lib.searchByTitle(title));
		System.out.println("Enter the ISBBN to borrow a book: ");		
		int isbn = sc.nextInt();
		
		try {
			lib.borrowBook(isbn);
		}catch (BorrowedException e) {
			System.out.println(e);
		}

	}

}
