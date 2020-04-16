package inheritance;

import java.io.Serializable;

public abstract class Animal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	protected int age;
	
	public abstract void giveLoud();

	public Animal() {
		super();
	}

	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void onlyAnimalsCanUseMe() {
		System.out.println("I AM AN ANIMAL!");
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [: " + (name != null ? "name=" + name + ", " : "") + "age=" + age + "]";
	}
	
	public void AnimalShout() {
		System.out.println("I AM AN ANIMAL!!!");
	}
	

}