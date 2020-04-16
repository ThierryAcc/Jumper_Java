package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import inheritance.Cat;
import inheritance2.Dog;

public class GenericMethodTest {

	public static void main(String[] args) {
		Cat mycat = new Cat("KitKat", 2);
		List<Cat> catList = getList(mycat);
		System.out.println(catList.get(0));
		
		Dog dog = new Dog("SnoopDog", 41);
		List<Dog> dogList = getList(dog);
		System.out.println(dogList.get(0));
		
		System.out.println(String.valueOf(true));
	}

	
	private static <T> List<T> getList(T element) {
		List<T> mylist = new ArrayList<>();
		mylist.add(element);
		return mylist;
	}
	
	private static <T> List<T> getListArray(T[] elements) {
		List<T> mylist = new ArrayList<>();
		mylist = Arrays.asList(elements);
		return mylist;
	}

}
