package by.home.maxzzzit;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

// Получим текущую дату и время в Париже с помощью класса ZonedDateTime
public class ZonedDataTimeParis {

	public static void main(String[] args) {

		ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(zdt);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.uuuu HH:mm");
		System.out.println(zdt.format(dtf));

	}

}
