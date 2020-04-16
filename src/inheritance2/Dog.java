package inheritance2;

import inheritance.Animal;

public class Dog extends Animal { // DRY = DON'T REPEAT YOURSELF
	
	public Dog() {
		this("Hundy", 22);
	}
	
	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void giveLoud() {
		System.out.println("WUFF");
	}
	
	@Override
	public void onlyAnimalsCanUseMe() {
		System.out.println("I AM A DOG!");
	}
	
	public void DogShout() {
		System.out.println("I AM A DOG?!");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		if (getName() == null) {
			if (other.getName() != null)
				return false;
		} else if (!getName().equals(other.getName()))
			return false;
		return true;
	}
	
	
}
