package misc;

public class VarArgs {
	
	public static void print(int x, String a) {
		System.out.println(a);
	}
	
	public static void print(int x, String ... array) {
		for (String str : array) {
			System.out.println(x + " " + str);
		}
	}
	
	public static void main(String[] args) {
		print(1, "eins", "zwei", "drei", "vier");
		print(2, "b");
		print(200);
	}

}