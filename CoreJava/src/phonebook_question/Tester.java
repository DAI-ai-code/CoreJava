package phonebook_question;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		PhoneBook pb = new PhoneBook();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name = s.nextLine();
		System.out.print("Enter number: ");
		int number = s.nextInt();
		s.nextLine();
		
		pb.addContact(name, number);
		pb.displayContact();
		
		System.out.print("Search by name: ");
		String n = s.nextLine();
		int a = pb.searchContact(n);
		System.out.println(a);
		
//		
		System.out.print("Enter name: ");
		name = s.nextLine();
		pb.deleteContact(name);
		pb.displayContact();
		
		

	}

}
