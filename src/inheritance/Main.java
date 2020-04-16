package inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import inheritance2.Dog;

public class Main {

	// wildcard bei der Typsierung der Variablen
	// T bei der Klassendefinition
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<?> list = new ArrayList<String>(); // zum printen oder loggen toString (nichts spezielles tun hier da zu oberflächlich
		List<? super Dog> blist = new ArrayList<Animal>();
		blist.add(new Dog("hab", 1));
		System.out.println(blist.get(0));
		
		List<? extends Animal> clist = new ArrayList<Dog>();
		// clist.add(new Dog("hab", 1));
		clist.add(null);
		//clist.add(new Dog("hab", 1)); // geht nicht
		
		
		Cat[] animals2 = {new Cat("Kitty", 3), new Cat("Bubi", 2)};
		Animal[] animals3 = {new Cat("Kitty", 3), new Cat("Bubi", 2)};
		System.out.println(animals2.equals(animals3));
		System.out.println(Arrays.equals(animals2, animals3));
		
		System.out.println(Arrays.toString(animals2));
		Arrays.sort(animals2, new SortCatByAge());
		System.out.println(Arrays.toString(animals2));
		System.out.println("\n");
		
		
		Set<Cat> catSetLambda = new TreeSet<> ( ( c1, c2 ) -> Integer.compare(c1.getAge(), c2.getAge()));
		Cat c1111 = new Cat("Kitty111111", 33);
		Cat c1112 = new Cat("Kitty222222", 2);
		Cat c1113 = new Cat("Carlo333333", 22);
		Cat c1114 = new Cat("CARLODISAPPEAR", 22); // weil compare by age .... gleiches Alter wird nicht hinzugefügt
		catSetLambda.add(c1111);
		catSetLambda.add(c1112);
		catSetLambda.add(c1113);
		catSetLambda.add(c1114);
		System.out.println("catsat lambda");
		System.out.println(catSetLambda);
		
		
	
		// new Anonymous implements Comparator
		Set<Cat> catSetAnonymous = new TreeSet<>(new Comparator<Cat>() {
			@Override
			public int compare(Cat o1, Cat o2) {
				//vertauschen
				return Integer.compare(o1.getAge(), o2.getAge() * -1);
				//return Integer.compare(o2.getAge(), o1.getAge());
			}
		});
		Cat c111 = new Cat("Kitty111111", 33);
		Cat c112 = new Cat("Kitty222222", 2);
		Cat c113 = new Cat("Carlo333333", 22);
		Cat c114 = new Cat("CARLODISAPPEAR", 22); // weil compare by age .... gleiches Alter wird nicht hinzugefügt
		catSetAnonymous.add(c111);
		catSetAnonymous.add(c112);
		catSetAnonymous.add(c113);
		catSetAnonymous.add(c114);
		System.out.println("catsat catSetAnonymous");
		System.out.println(catSetAnonymous);
		System.out.println("\n");
		
		
		Set<Cat> catSet2 = new TreeSet<Cat>(new SortCatByAge()); // TreeSet verwendet compareTo von Comparable nicht equals
		Cat c11 = new Cat("Kitty111", 33);
		Cat c12 = new Cat("Kitty222", 2);
		Cat c13 = new Cat("Carlo333", 22);
		Cat c14 = new Cat("CARLODISAPPEAR", 22); // weil compare by age .... gleiches Alter wird nicht hinzugefügt
		catSet2.add(c11);
		catSet2.add(c12);
		catSet2.add(c13);
		catSet2.add(c14);
		System.out.println(catSet2);
		System.out.println("\n");
		
		
		
		
		
		// damit die Klasse selbst weiss wie zu sortieren
		// muss Cat Comparable implementieren
		Set<Cat> catSet = new TreeSet<Cat>(); // TreeSet verwendet compareTo von Comparable nicht equals
		Cat c3 = new Cat("Kitty", 33);
		Cat c1 = new Cat("Kitty", 2);
		Cat c2 = new Cat("Carlo", 6);
		catSet.add(c1);
		catSet.add(c2);
		catSet.add(c3);
		System.out.println(catSet.size());
		System.out.println(catSet);
		
		// the equals methode von Object braucht die Addresse
		// heisst es gibt 3 Katzen im HashSet!!!
		Set<Cat> nameSet = new HashSet<Cat>();
		nameSet.add(new Cat("Kitty", 3));
		nameSet.add(new Cat("Kitty", 3));
		nameSet.add(new Cat("Kitty", 3));
		System.out.println("Weil wir equals und hashcode überschrieben haben nur noch eine Katze");
		System.out.println(nameSet.size());
		
		Animal[] animals = {new Cat("Kitty", 3), new Dog("Hasso", 7)};
		for (Animal animal : animals) {
			System.out.println(animal);
			animal.giveLoud();
		}
		
		Animal dogAnimal = new Dog(null, 0);
		dogAnimal.giveLoud();
		dogAnimal.onlyAnimalsCanUseMe();
		Animal catAnimal = new Dog(null, 0);
		catAnimal.giveLoud();
		catAnimal.onlyAnimalsCanUseMe();
		
		Dog dog = new Dog("Snoop", 44);
		dog.giveLoud();
		dog.onlyAnimalsCanUseMe();
		
		Cat cat = new Cat("hibi", 2);
		System.out.println(cat.getAge());
		// System.out.println(dog.age); default outside package
		
		Cat cat2 = new Cat();
		System.out.println(cat2);
		
		
	}

}
