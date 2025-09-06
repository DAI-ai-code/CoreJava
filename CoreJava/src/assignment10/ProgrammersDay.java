package assignment10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProgrammersDay {
	public static void main(String[] args) {
		Stream<LocalDate> wholeYear = LocalDate.of(2025, 1, 1).datesUntil(LocalDate.of(2026, 1, 1));
		System.out.println("The programmer's day in the year 2025 is on: ");
		List<LocalDate> list = new ArrayList<LocalDate>();
		list = wholeYear.filter((s) -> s.getDayOfYear()==256).collect(Collectors.toList());
		LocalDate d = list.get(0);
		System.out.println(d.getDayOfMonth() + " " + d.getMonth()+ " " +d.getYear());
		
	}
}
