package dates;

import java.time.LocalDate;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		Customer c = new Customer("Thierry", "Bitz", LocalDate.of(1988, 11, 18));
		System.out.println(c.getAge());
		LocalDate l = LocalDate.of(1988, 11, 1);
		l = l.now();
		
		HashSet<String> set = new HashSet<String>();
		set.add(new String("a"));
		set.add(new String("b"));
		set.add(new String("c"));
		 
		for(String str: set) {
			str = "a";
			System.out.println(str);			
		}
		
		
	}

}
