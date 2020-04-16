package exam.collections;

import java.util.Set;
import java.util.TreeSet;

import exam.fahrzeug.Owner;
import exam.fahrzeug.Traktor;

public class Main {

	public static void main(String[] args) {
		Traktor t1 = new Traktor(2000, new Owner("Felix"));
		Traktor t2 = new Traktor(1000, new Owner("Urs"));
		Traktor t3 = new Traktor(5000, new Owner("Peter"));
		Set<Traktor> traktorSet = new TreeSet<>();
		traktorSet.add(t1);
		traktorSet.add(t2);
		traktorSet.add(t3);

		System.out.println(traktorSet);

	}

}
