package assignment7;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FruitShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> fruitList = List.of("Mango", "orange", "Grapes", "apple", "Banana", "strawberry", "Watermelon");
		Stream<String> fruitStream = fruitList.stream();
		
		System.out.println("---------------Ans 1: To upper and Lower case-----------------");
		fruitStream.map((s)->s.toUpperCase()).forEach(System.out::println);
		System.out.println("\n");
		fruitStream = fruitList.stream();
		fruitStream.map((s)->s.toLowerCase()).forEach(System.out::println);
		System.out.println("---------------Ans 2 & 3: Filtering & Sorting -----------------");
		fruitStream = fruitList.stream();
		fruitStream.filter(s -> s.toLowerCase().charAt(0) < 'n').sorted().forEach(System.out::println);
		System.out.println("\n");
		fruitStream = fruitList.stream();
		fruitStream.filter(s -> s.toLowerCase().charAt(0) < 'n').sorted(new FruitNameComparator()).forEach(System.out::println);
		
		System.out.println("---------------Ans 4: Filtering with UpperCase-----------------");
		fruitStream = fruitList.stream();
		fruitStream.filter(s -> s.charAt(0)>=65 && s.charAt(0) < 93).forEach(System.out::println);
		System.out.println("------------------Ans 4: Collection Testing---------------------------------");
		fruitStream = fruitList.stream();
		List<String> upperCaseFruits = fruitStream.filter(s -> s.charAt(0)>=65 && s.charAt(0) < 93).collect(Collectors.toList());
		System.out.println(upperCaseFruits + "\n\n");
		
		
		System.out.println("---------------Ans 5: Filter by length & Sort -----------------");
		fruitStream = fruitList.stream();
		fruitStream.filter(s -> s.length() <= 6).sorted(new FruitNameComparator()).forEach(System.out::println);
		System.out.println("--------------------------------------------------------------\n\n");
		
		System.out.println("---------------Ans 6: Sort length wise -----------------");	
		fruitStream = fruitList.stream();
		List<String> lengthWiseFruits = fruitStream.sorted(new FruitLengthComparator()).collect(Collectors.toList());
		System.out.println(lengthWiseFruits);
		
		
	}

}
