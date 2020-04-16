package exam.fahrzeug;

public abstract class Fahrzeug implements I1 {

	private int price;

	protected abstract Fahrzeug returnMe();
	
	public abstract void drive(int distance);

	public Fahrzeug(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void print() {
		System.out.println(I1.CONSTI2);
		System.out.println(I1.CONSTI2);
	}

	@Override
	public String toString() {
		return "Fahrzeug [price=" + price + "]";
	}
	
	
}
