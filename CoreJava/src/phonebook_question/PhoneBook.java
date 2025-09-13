package phonebook_question;

import java.util.*;

public class PhoneBook {
	public static List<Contact> contacts = new ArrayList<>();
	
	public PhoneBook() {
		generatePhoneBook();
	}
	
	public void generatePhoneBook() {
		Contact c1 = new Contact("abc", 555555);
		Contact c2 = new Contact("def", 111111);
		Contact c3 = new Contact("ghi", 222222);
		Contact c4 = new Contact("jkl", 333333);
		Contact c5 = new Contact("mno", 444444);
		Contact c6 = new Contact("pqr", 666666);
		Contact c7 = new Contact("stu", 777777);
		Contact c8 = new Contact("vwx", 888888);
		Contact c9 = new Contact("yz",  999999);
		Contact c10 = new Contact("xyz", 123456);
		
		contacts.add(c1);
		contacts.add(c2);
		contacts.add(c3);
		contacts.add(c4);
		contacts.add(c5);
		contacts.add(c6);
		contacts.add(c7);
		contacts.add(c8);
		contacts.add(c9);
		contacts.add(c10);
	}
	
	public void addContact(String name, int number) {
		contacts.add(new Contact(name, number));
		System.out.println("------------New contact has been added------------");
	}
	
	public void displayContact() {
		contacts.stream().forEach(System.out::println);
	}
	
	public int searchContact(String name) {
		Optional<Contact> cont = contacts.stream().filter((c) -> c.getName().equalsIgnoreCase(name)).findFirst();
		if(cont.isPresent()) {
			return cont.get().getNumber();
		}
		return 0;		
	}
	
	public void deleteContact(String name) {
		Optional<Contact> cont = contacts.stream().filter((c) -> c.getName().equalsIgnoreCase(name)).findFirst();
		if(cont.isPresent()) {
//			contacts.removeIf(contacts::remove); not working, error
			contacts.remove(cont.get());
		}
	}
}
