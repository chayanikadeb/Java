package java_basic_0;

import java.time.format.DateTimeFormatter;

public class DatetimeFormating {

	public static void main(String[] args) {
		DateTimeFormatter Dt=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		 System.out.println("After formatting: " + Dt);

	}

}
