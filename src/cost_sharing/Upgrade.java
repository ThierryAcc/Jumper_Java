package cost_sharing;
import java.util.Random;

public class Upgrade {

	static int _x = 0;
	static int _y = 0;
	static int _z = 0;
	static int _total = 0;
	static int _avg = 0;
	
	public static void main(String[] args) {
		argsExpenses(args);
		// randomExpenses();
		calcExpenses();
		printExpenses();
	}
	
	public static void argsExpenses(String[] args) {
		_x += Integer.parseInt(args[0]);
		_y += Integer.parseInt(args[1]);
		_z += Integer.parseInt(args[2]);
	}
	
	public static void randomExpenses() {
		Random r = new Random();
		_x += r.nextInt(100);
		_y += r.nextInt(100);
		_z += r.nextInt(100);
	}
	
	public static void calcExpenses() {
		_total = _x + _y + _z;
		_avg = _total / 3;		
	}
	
	public static void printExpenses() {
		System.out.println("X Payed: " + _x);
		System.out.println("Y Payed: " + _y);
		System.out.println("Z Payed: " + _z);
		System.out.println("-------------------------------------");
		System.out.println("Total: " + _total);
		System.out.println("Avg: " + _avg);
		System.out.println("-------------------------------------");
		System.out.println("X difference: " + (_x - _avg));
		System.out.println("Y difference: " + (_y - _avg));
		System.out.println("Z difference: " + (_z - _avg));
	}
}

