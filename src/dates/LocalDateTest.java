package dates;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		LocalDate mydate = LocalDate.of(1999,  Month.JANUARY, 20);
		LocalDate mydate2 = LocalDate.of(1999,  1, 20);
		System.out.println(mydate);
		System.out.println(mydate2);
		
	}

}
