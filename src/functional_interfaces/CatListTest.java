package functional_interfaces;

import static java.lang.Math.sqrt;
import static java.util.Comparator.comparing; // Methodenimport

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

import inheritance.Animal;
import inheritance.Cat;
import inheritance2.Dog;

public class CatListTest {

	public static void main(String[] args) {
		List<Animal> animalList = new ArrayList<Animal>();
		animalList.add(new Dog());
		
		Set<String> s = new HashSet<>();
		s.add("lion");
		s.add("tiger");
		s.add("bear");
		s.forEach((str)-> System.out.println(str));
		s.forEach(System.out::println);
		
		System.out.println(sqrt(2));
		
		List<Cat> catList = new ArrayList<Cat>();
		catList.add(new Cat("B", 5));
		catList.add(new Cat("DA", 2));
		catList.add(new Cat("CD", 1));
		catList.add(new Cat("1CAT", 4));
		
		System.out.println(catList);
		
		// compare return ist ein Comparator
		catList.sort((c1, c2) -> Integer.compare(c1.getAge(), c2.getAge()));
		
		// compareTo ist der Grund weshalb wir wissen das ist ein Comparator
		catList.sort((c1, c2) -> c1.getName() != null ? c1.getName().compareTo(c2.getName()) : null);
		System.out.println(catList);
		
		catList.forEach(System.out :: println); // Methodenreferenz
		catList.forEach(cat -> System.out.println(cat));

		catList.sort(comparing(Cat::getName).thenComparing(Cat::getAge));
		System.out.println(catList);
		
		System.out.println("\nafter predicate remove");
		Predicate<Cat> isAdult = c -> c.getAge() >= 3;
		catList.removeIf(isAdult.negate());
		catList.forEach(System.out::println);
		
		System.out.println("\nafter predicate name");
		Predicate<Cat> hasName = c -> c.getName().equals("B");
		catList.removeIf(hasName);
		catList.forEach(System.out::println);
	}

}
