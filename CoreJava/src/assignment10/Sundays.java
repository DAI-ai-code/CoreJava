package assignment10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sundays {

	public static void main(String[] args) {

		Stream<LocalDate> stream = LocalDate.of(2025, 1, 1).datesUntil(LocalDate.of(2026, 1, 1));
		
		List<LocalDate> months = stream.filter((d) -> d.getDayOfMonth()==1 && d.getDayOfWeek()==DayOfWeek.SUNDAY).collect(Collectors.toList());
		System.out.println("The months with Sundays on the 1st day are: " + months.get(0).getMonth());

	}

}
