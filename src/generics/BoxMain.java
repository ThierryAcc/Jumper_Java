package generics;

import java.util.ArrayList;

import inheritance.Animal;
import inheritance.Cat;
import inheritance2.Dog;

public class BoxMain {

	public static void main(String[] args) {
				
		
		BoxWildcard<Dog> wildcard1 = new BoxWildcard<>();
		wildcard1.setElement(new Dog());
		wildcard1.getElement().DogShout();

		// METHODEN >= T OBJECT
		Object obj = new Object();
		BoxWildcard<?> wildcard2 = new BoxWildcard<Dog>();
		wildcard2.getElement(); // alles von 
		System.out.println(wildcard2.toString()); 	
		
		
		// wildcard2.setElement(obj); not possible
		// wildcard2.setElement(new Dog());
		
		// METHODEN >= ANIMAL  
		BoxWildcard<Animal> wildcard3 = new BoxWildcard<>();
		wildcard3.setElement(new Dog());
		wildcard3.getElement().AnimalShout();
		
		
		
		
		
		BoxExtends<Dog> boxExtendsAnimal = new BoxExtends<>();
		BoxExtends<Animal> box = new BoxExtends<>();
		box.setElement(new Cat("Kit", 1));
		System.out.println(box.getElement());
		box.setElement(new Cat("Kat", 2));
		System.out.println(box.getElement());
		box.setElement(new Dog());
		System.out.println(box.getElement());
		
		// only animal methods usable <? extends Animal>
		box.getElement().AnimalShout();
		
		
		BoxExtends<Cat> box2 = new BoxExtends<>();
		box2.setElement(new Cat());
		System.out.println(box2.getElement());
		
		BoxObject mybox = new BoxObject();
		mybox.setElement("Wednesday");
//		mybox.setElement(21);
		String day = (String) mybox.getElement();
		System.out.println(day);

	}

}