package misc.promotion;

public class Main {
	
	public void test(int n) {
		System.out.println(n);
	}
	
	public void test(long l) {
		System.out.println(l);
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		
		short s = 123;
		m.test(s); //nimmt nächsthöhere = promotion to (int)
		
		float f = 123.00f;
		m.test((long) f); // runter casten
	}

}
