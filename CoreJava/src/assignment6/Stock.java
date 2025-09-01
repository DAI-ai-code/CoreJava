package assignment6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Stock {
	public static int currentYear = 2025;
	
	
	public static List<Toy> createToyList(){
		
		List<Toy> toysList = new ArrayList<Toy>();
//		String productId, double price,  String name, String category, int age, int year
		
		toysList.add(new Toy("TT", 200, "Car", "Vehicle", 8, 2024));
		toysList.add(new Toy("LL", 1000, "Truck", "Vehicle", 12, 2025));
		toysList.add(new Toy("MM", 500, "Bike", "Vehicle", 10, 2023));
		toysList.add(new Toy("NN", 800, "Teddy Bear", "Soft Toy", 6, 2025));
		toysList.add(new Toy("OO", 2000, "Labubu Doll", "Soft Toy", 7, 2024));
		toysList.add(new Toy("PP", 300, "Barbie Doll", "Soft Toy", 6, 2025));
		toysList.add(new Toy("QQ", 5000, "LEGO", "Puzzle", 14, 2023));
		toysList.add(new Toy("RR", 100, "Jigsaw", "Puzzle", 13, 2024));
		toysList.add(new Toy("SS", 900, "Mechanix", "Puzzle", 13, 2025));
		
		return toysList;
	}
	
	public static List<Toy> filterByCategory(List<Toy> toyMainList, String category){
		List<Toy> filteredToyList = new ArrayList<Toy>();
		for (Toy t: toyMainList) {
			if (t.getCategory().equalsIgnoreCase(category)) {
				filteredToyList.add(t);
			}
		}
		return filteredToyList;
	}
	
	public static int searchById(List<Toy> toyMainList, String prodId){	
		List<Toy> sortedToysList = toyMainList;
		Collections.sort(sortedToysList, new ProductIdComparator());
		return Collections.binarySearch(sortedToysList, new Toy(prodId, 0, null, null, 0, 0), new ProductIdComparator());
	}
	
	public static List<Toy> sortByPrice(List<Toy> toyMainList){
		List<Toy> filteredToyList = toyMainList;
		Collections.sort(filteredToyList, new PriceComparator());
		return filteredToyList;
	}
	
	public static List<Toy> sortByName(List<Toy> toyMainList){
		List<Toy> filteredToyList = toyMainList;
		Collections.sort(filteredToyList, new NameComparator());
		return filteredToyList;
	}
	
	public static List<Toy> sortById(List<Toy> toyMainList){	
		List<Toy> sortedToysList = toyMainList;
		Collections.sort(sortedToysList, new ProductIdComparator());
		return sortedToysList;
	}
	
	public static List<Toy> filterByRange(List<Toy> toyMainList,double p1, double p2){
		List<Toy> pricedToyList = new ArrayList <Toy>();
		for (Toy t: toyMainList) {
			if(t.getPrice()>= p1 && t.getPrice()<=p2) {				
				pricedToyList.add(t);
			}
		}
		return pricedToyList;
	}
	
	public static List<Toy> filterByAge(List<Toy> toyMainList,int age){
		List<Toy> ageToyList = new ArrayList <Toy>();
		for (Toy t: toyMainList) {
			if(t.getAge()==age) {				
				ageToyList.add(t);
			}
		}
		return ageToyList;
	}
	
	public static Map<String,List<Toy>> filterByGroup(List<Toy> toyMainList){
		Map<String,List<Toy>> map = new HashMap<String,List<Toy>>();
		
		List<Toy> vehicleToys = new ArrayList<Toy>();
		List<Toy> softToys = new ArrayList<Toy>();
		List<Toy> puzzleToys = new ArrayList<Toy>();

		
		for(Toy t: toyMainList) {
			switch (t.getCategory()) {
				case "Vehicle":
					vehicleToys.add(t);
					break;
				case "Soft Toy":
					softToys.add(t);
					break;
				case "Puzzle":
					puzzleToys.add(t);
					break;
			}
					
		}
		
		map.put("Vehicle", vehicleToys);
		map.put("Soft Toy", softToys);
		map.put("Puzzle", puzzleToys);
		
		
		return map;
		
	}

	public static List<Toy> filterOldStock(List<Toy> toyMainList){
		
		List<Toy> oldStockList = new ArrayList<Toy>();
		
		for(Toy t: toyMainList) {
			if(currentYear - t.getYear() > 1) {
				oldStockList.add(t);
			}
		}
		
		return oldStockList;
	}

}
