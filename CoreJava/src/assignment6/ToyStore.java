package assignment6;

import java.util.List;
import java.util.Map;

public class ToyStore {

	public static void main(String[] args) {
		 
		List<Toy> toyMainList = Stock.createToyList(); 
		System.out.println(toyMainList);
		
		System.out.println("\n---------------FILTER BY CATEGORY----------------------------\n");
		
		List<Toy> toyList = Stock.filterByCategory(toyMainList,"Vehicle");
		System.out.println(toyList);
		
		System.out.println("\n-----------------SORT BY ID-------------------------------------------\n");
		toyList = Stock.sortById(toyMainList);
		System.out.println(toyList);
		
		System.out.println("\n-----------------SEARCH BY ID---------------------------------------\n");
		System.out.println(Stock.searchById(toyMainList, "OO"));
		
		System.out.println("\n-----------------FILTER BY RANGE-------------------------------------\n");
		toyList = Stock.filterByRange(toyMainList, 300, 3000);
		System.out.println(toyList);
		
		System.out.println("\n-----------------FILTER BY AGE--------------------------------------\n");
		toyList = Stock.filterByAge(toyMainList, 8);
		System.out.println(toyList);
		
		System.out.println("\n-----------------FILTER BY GROUP------------------------------------------\n");
		Map<String,List<Toy>> toysGroup = Stock.filterByGroup(toyMainList);
		System.out.println(toysGroup);
		
		System.out.println("\n-----------------SORT BY PRICE-----------------------------------------\n");
		toyList = Stock.sortByPrice(toyMainList);
		System.out.println(toyList);
		
		System.out.println("\n-----------------SORT BY NAME-------------------------------\n");
		toyList = Stock.sortByName(toyMainList);
		System.out.println(toyList);
		
		System.out.println("\n-----------------OLD STOCK----------------------------------\n");
		toyList = Stock.filterOldStock(toyMainList);
		System.out.println(toyList);
	}
	
}
