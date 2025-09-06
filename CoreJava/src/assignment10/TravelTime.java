package assignment10;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class TravelTime {
	
	public static void main(String[] args) {
		
		ZonedDateTime mumZoned = ZonedDateTime.of(LocalDateTime.of(LocalDate.now(), LocalTime.of(2, 5)), ZoneId.of("Asia/Kolkata") );
		ZonedDateTime nyZoned = ZonedDateTime.of(LocalDateTime.of(LocalDate.now(), LocalTime.of(8, 40)), ZoneId.of("America/New_York"));
		Duration diff = Duration.between(mumZoned, nyZoned.toInstant().atZone(ZoneId.of("Asia/Kolkata")));
		
		System.out.println("The flight took " + diff.toHoursPart() + " hours and " + diff.toMinutesPart() + " minutes.");
	}

}
