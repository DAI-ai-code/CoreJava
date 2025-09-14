package tech_gadget_question;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class TechGadget{
	
	public static List<Gadget> gadgets = new ArrayList<>();
	
	public void generateGadgetList() {
		Gadget g1 = new Gadget(LocalDate.of(2025, 1, 1), 20, LocalDate.of(2025, 2, 2), LocalDate.of(2025, 2, 2), "Dell", 100000, 10, "LAPTOP");
		Gadget g2 = new Gadget(LocalDate.of(2025, 1, 5), 15, LocalDate.of(2025, 2, 10), LocalDate.of(2025, 2, 15), "HP", 85000, 8, "LAPTOP");
		Gadget g3 = new Gadget(LocalDate.of(2025, 1, 10), 30, LocalDate.of(2025, 3, 1), LocalDate.of(2025, 3, 1), "Apple", 120000, 5, "SMARTPHONE");
		Gadget g4 = new Gadget(LocalDate.of(2025, 1, 15), 25, LocalDate.of(2025, 2, 20), LocalDate.of(2025, 2, 28), "Samsung", 95000, 12, "TABLET");
		Gadget g5 = new Gadget(LocalDate.of(2025, 1, 20), 10, LocalDate.of(2025, 3, 5), LocalDate.of(2025, 3, 10), "Lenovo", 70000, 6, "LAPTOP");
		Gadget g6 = new Gadget(LocalDate.of(2021, 1, 25), 18, LocalDate.of(2025, 2, 25), null, "OnePlus", 55000, 15, "SMARTPHONE");
		Gadget g7 = new Gadget(LocalDate.of(2025, 2, 1), 22, LocalDate.of(2025, 3, 12), LocalDate.of(2025, 3, 15), "Asus", 80000, 7, "LAPTOP");
		Gadget g8 = new Gadget(LocalDate.of(2025, 2, 5), 12, LocalDate.of(2025, 3, 20), LocalDate.of(2025, 3, 22), "Xiaomi", 40000, 20, "TABLET");
		Gadget g9 = new Gadget(LocalDate.of(2021, 2, 10), 28, LocalDate.of(2025, 3, 25), null, "Google", 65000, 9, "SMARTPHONE");
		Gadget g10 = new Gadget(LocalDate.of(2025, 2, 15), 14, LocalDate.of(2025, 3, 30), LocalDate.of(2025, 4, 1), "Microsoft", 110000, 4, "TABLET");
		
		gadgets.add(g1);
		gadgets.add(g2);
		gadgets.add(g3);
		gadgets.add(g4);
		gadgets.add(g5);
		gadgets.add(g6);
		gadgets.add(g7);
		gadgets.add(g8);
		gadgets.add(g9);
		gadgets.add(g10);
		
	}
	
	public void displayGadgets() {
		gadgets.stream().forEach(System.out::println);
	}
	
	public void addGadget(Gadget g){
		gadgets.add(g);
	    System.out.println("***ADDED A NEW GADGET***");
	    System.out.println("Gadget added is: " + g.toString());
	}
	
	public void updateStock(Gadget g ,int newStock) {
		g.setStock(newStock);
		g.setStockUpdateDate(LocalDate.now());
		System.out.println("Gadget updated is: " + g.toString());
	}

	public void updateDiscount() {
		List<Gadget> notSold =  gadgets.stream().filter( g -> LocalDate.now().getMonthValue() - g.getLastSellDate().getMonthValue() > 6 ).collect(Collectors.toList());
		for (Gadget g: notSold) {
			g.setDiscount(25);
		}
	}
	
	public void removeUnsoldGadgets() {
		List<Gadget> notSold = gadgets.stream().filter( g -> LocalDate.now().getYear() - g.getListingDate().getYear() > 1 && g.getLastSellDate() == null).collect(Collectors.toList());
		for (Gadget g: notSold) {
			System.out.println("Removing Gadgets with ID: " + g.getId());
			gadgets.remove(g);
		}
		displayGadgets();
	}
}
