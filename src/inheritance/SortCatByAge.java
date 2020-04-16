package inheritance;

import java.util.Comparator;

public class SortCatByAge implements Comparator<Cat> {

	public SortCatByAge() {
		// TODO Auto-generated constructor stub
	}

	// ich bin ausserhalb der Klasse, deshalb zwei inputs
	@Override
	public int compare(Cat o1, Cat o2) {
		return Integer.compare(o1.getAge(), o2.getAge());
	}

}
