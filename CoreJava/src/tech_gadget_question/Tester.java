package tech_gadget_question;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Tester  {
	
	static TechGadget store = new TechGadget();
	static Scanner s = new Scanner(System.in);
	
	public static void addNewGadget() throws IllegalArgumentException, InputMismatchException{
		try {
		System.out.println("Enter stock quantity: ");
		int stock = s.nextInt();
		s.nextLine();
		
		System.out.println("Enter Brand Name: ");
		String brand = s.nextLine();
		
		System.out.println("Enter price: ");
		int price = s.nextInt();
		s.nextLine();
		
		System.out.println("Enter discount %: ");
		int discount = s.nextInt();
		s.nextLine();
		
		System.out.println("Enter Category(LAPTOP/SMARTPHONE/TABLET): ");
		String category = s.nextLine();
		if (category == null) {
	        throw new IllegalArgumentException("Invalid category! Allowed: LAPTOP, SMARTPHONE, TABLET");
	    }
		store.addGadget(new Gadget(LocalDate.now(), stock, LocalDate.now(), LocalDate.now(), brand, price, discount, category.toUpperCase()));
		}
		catch(InputMismatchException e) {
			System.out.println("enter correct typess");
		}
	}
	
	public static void updateGadgetStock() {
		System.out.println("Enter gadget ID: ");
		int id = s.nextInt();
		s.nextLine();
		
		System.out.println("Enter new stock available: ");
		int stockNew = s.nextInt();
		s.nextLine();
	
		List<Gadget> found = store.gadgets.stream().filter(g -> g.getId() == id).collect(Collectors.toList());
		if (!found.isEmpty()) {
	        store.updateStock(found.get(0), stockNew);
	    } else {
	        System.out.println("No gadget found with ID: " + id);
	    }	
	}
	
	public static void main(String[] args) {
		store.generateGadgetList();
		try {
//			Answer 1
			addNewGadget();
//			Answer 2
			store.displayGadgets();
			updateGadgetStock();
			store.displayGadgets();
			
//			Answer 3
			store.updateDiscount();
			store.displayGadgets();
			
//			Answer 4
			store.removeUnsoldGadgets();
			
		}catch(IllegalArgumentException e) {
			System.out.println("Arre yr");
		}

		
	}
}
