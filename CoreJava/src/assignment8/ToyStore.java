package assignment8;
import assignment6.Toy;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import assignment6.Stock;

public class ToyStore {

	public static void main(String[] args) {
		System.out.println("<~~~~~~~~~~~~~~~List Toys~~~~~~~~~~~~~~~~~~~~~>\n");
		List<Toy> toyList = Stock.createToyList();
		Stream<Toy> stream = toyList.stream();
		
		stream.forEach(System.out::println);
		
		System.out.println("<~~~~~~~~~~~~~~~Filter By Category~~~~~~~~~~~~~~~~>\n");
		stream = toyList.stream();
		stream.filter((t) -> t.getCategory().equalsIgnoreCase("Vehicle")).forEach(System.out::println);
		
		System.out.println("<~~~~~~~~~~~~~~~Filter By Price range~~~~~~~~~~~~~~~~>\n");
		stream = toyList.stream();
		stream.filter((t) -> t.getPrice() >=500 && t.getPrice() <=1000).forEach(System.out::println);
		
		System.out.println("<~~~~~~~~~~~~~~~Sort by price & category~~~~~~~~~~~~~~~~>\n");
		stream = toyList.stream();
		Comparator<Toy> priceComparator = Comparator.comparing(Toy::getPrice);
		Comparator<Toy> categoryComparator = Comparator.comparing(Toy::getCategory);
		stream.sorted(priceComparator.thenComparing(categoryComparator)).forEach(System.out::println);
		
		System.out.println("<~~~~~~~~~~~~~~~Sort by category & price~~~~~~~~~~~~~~~~>\n");
		stream = toyList.stream();
		Comparator<Toy> byPrice = Comparator.comparing(Toy::getPrice);
		Comparator<Toy> byCategory = Comparator.comparing(Toy::getCategory);
		stream.sorted(byCategory.thenComparing(byPrice)).forEach(System.out::println);
		
		System.out.println("<~~~~~~~~~~~~~~~Old stock~~~~~~~~~~~~~~~~>\n");
		stream = toyList.stream();
		stream.filter((t) -> t.getYear()<2024).forEach(System.out::println);

		System.out.println("<~~~~~~~~~~~~~~~Grouping by categories and count~~~~~~~~~~~~>\n");
		stream = toyList.stream();
		Map<String, List<Toy>> mappedList = new HashMap<String, List<Toy>>();
		mappedList =  stream.collect(Collectors.groupingBy((t) -> t.getCategory()));
		mappedList.forEach((k,v) -> System.out.println(k +" -> "+ v + " with count: " +  v.size()));
		
		System.out.println("<~~~~~~~~~~~~~~~Most and least expensive~~~~~~~~~~~~>\n");
		stream = toyList.stream();
		Optional<Toy> a = stream.min(priceComparator);
		if(a.isPresent()) {
			System.out.println(a.get().getPrice());
		}
		stream = toyList.stream();
		Optional<Toy> b = stream.max(priceComparator);
		if(b.isPresent()) {
			System.out.println(b.get().getPrice());
		}
		
		
		System.out.println("<~~~~~~~~~~~~~~~Group by age and count stock~~~~~~~~~~~~>\n");
		stream = toyList.stream();
		Map<Integer,List<Toy>> ageGrp = stream.collect(Collectors.groupingBy(Toy::getAge));
		ageGrp.forEach((k,v) -> System.out.println("Age: " + k + " " + v +"\nCount: " +v.size()));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		}

}
