package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList {
	
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>(100);
		nameList.add("Marry");
		nameList.add(0, "Peter"); // teurer Aufruf
		nameList.add(1, "Paul");
		nameList.add("Marry");
		nameList.set(3, "John");

		System.out.println(nameList);
		System.out.println(nameList.size());
		
		// pass nothing = objectsArray
		Object[] objectsArray = nameList.toArray();
		System.out.println(Arrays.toString(objectsArray));
		
		// pass a string array
		String[] stringArray = nameList.toArray(new String[0]);
		System.out.println(Arrays.toString(stringArray));
		
		
		// ACHTUNG BEI PRIMITIVEN DATENTYPE
		// AUTOBOXING Integer nicht int value
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(7); // numList.add(Integer.valueOf(2)); AUTOBOXING
		numList.add(1);
		numList.add(0); 
		System.out.println(numList);
		
		
		// numList.remove(7); geht nicht, index 7
		numList.remove(Integer.valueOf(7)); // funktioniert
		System.out.println(numList);
	}

}
