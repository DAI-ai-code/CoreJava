package assignment10;

import java.time.LocalDate;
import java.time.Period;

public class CalAge {
	
	
	public static void main(String[] args) {
		
		LocalDate dob = LocalDate.of(2002, 8, 03);
		LocalDate now = LocalDate.now();
		
		Period age = dob.until(now);
		System.out.println("Your age is " + age.getYears() + " years " + age.getMonths() + " months " + age.getDays() + " days.");
		
		
	}
}
