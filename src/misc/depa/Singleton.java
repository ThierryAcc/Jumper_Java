package misc.depa;

public class Singleton {
	
	// lazy variante
	private int value = 123;
	
	
	// eager variante - erzeugt immer eine instanz
	private static Singleton instance = new Singleton(); //eager
	
	private Singleton() {
		getInstance();
	}

	public static Singleton getInstance() {
		return instance;
	}
	
	public static Singleton getInstanceLazy() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}
