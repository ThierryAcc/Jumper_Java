package inheritance;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Comparable ist ein Callback Interface
// Methode compareTo wird von jmd anderem aufgerufen (der TreeSet, nicht ich selbst)
public class Cat extends Animal implements Comparable<Cat>, Serializable {
	private static final long serialVersionUID = 1L;
	
	// transient = please don't serialize
	private transient Collar collar;

	public void getCatLove() {
		System.out.println("Some love from the cat");
	}

	public Cat(String name, int age) {
		super(name, age);
	}
	
	public Cat(String name, int age, Collar collar) {
		super(name, age);
		this.collar = collar;
	}

	public Cat() {
		this("Garfield", 12); // ruft Konstruktor der gleichen Klasse auf
	}

	public void CatShout() {
		System.out.println("I AM A CAT!!!");
	}

	@Override
	public void giveLoud() {
		System.out.println("MIAUS");
	}
	
	@Override
	public String toString() {
		return "Cat [collar=" + collar + ", age=" + age + ", getName()=" + getName() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((getName() == null) ? 0 : getName().hashCode()); // delegiert den HashCode an die
																					// Klasse String
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // ist der andere ich selbst (Adresse)
			return true;
		if (obj == null) // andere ist null dann false, weil ich jmd bin
			return false;
		if (getClass() != obj.getClass()) // getClass() ist immer dieselbe Adresse pro geladene Klasse (Cat hier). nicht
											// gleiche Klasse dann false
			return false;
		Cat other = (Cat) obj; // Downcast von rechts spezieller nach links weniger speziell
		if (age != other.age) // mein alter nicht gleich alter des anderen
			return false; // dann false
		if (getName() == null) { // wenn ich keinen Namen habe
			if (other.getName() != null) // , der andere hat aber einen
				return false; // dann false
		} else if (!getName().equals(other.getName())) // mein Name nicht gleich sein Name
			return false; // dann false
		return true; // sonst true
	}

	@Override
	public int compareTo(Cat o) {
		String name = getName();

		if (name == null) {
			return 0;
		}

		int nameint = name.compareTo(o.getName());
		if (nameint != 0) {
			return nameint;
		}

		return Integer.compare(this.age, o.age);
	}

	public Collar getCollar() {
		return collar;
	}

	public void setCollar(Collar collar) {
		this.collar = collar;
	}
	
	private void writeObject(ObjectOutputStream oos) {
		try {
			oos.defaultWriteObject();
			oos.writeUTF(collar.getColor());
			oos.writeInt(collar.getSize());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	private void readObject(ObjectInputStream ois) {
		try {
			ois.defaultReadObject();
			collar = new Collar(ois.readUTF(), ois.readInt());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
