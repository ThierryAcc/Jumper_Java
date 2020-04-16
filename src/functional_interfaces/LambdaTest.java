package functional_interfaces;

public class LambdaTest {

	public static void main(String[] args) {
		LambdaOutput printer = (i) -> System.out.println(i);
		
		
		
		Calcable add = new Calcable() {
			@Override
			public long doCalc(int num1, int num2) {
				return num1 + num2;
			}
		};
		
		Calcable multiply = (n1,n2) -> n1 * n2; // LAMBDA
		long result = doCalculation(22, 66, add);
		
		System.out.println(result);
		result = doCalculation(22, 66, multiply);
		System.out.println(result);
		
		Calcable divide = (int n1, int n2) -> { 
			return n1 / n2; 
		};
		
		result = doCalculation(66, 22, divide);
		System.out.println(result);
	}

	// zwei Werte und eine Anweisung
	private static long doCalculation(int i, int j, Calcable calc) {
		return calc.doCalc(i, j);
	}

}
