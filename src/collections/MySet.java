package collections;

import java.util.HashSet;
import java.util.Set;

public class MySet {
	public static void main(String[] args) {
		Set<String> nameSet = new HashSet<>();
		System.out.println(nameSet.add("Peter"));
		nameSet.add("Mary");
		nameSet.add("Tom");
		nameSet.add("d");
		System.out.println(nameSet.add("Peter"));
		System.out.println(nameSet.contains("Mary"));
		System.out.println(nameSet.remove("Daniel"));
	}

}
