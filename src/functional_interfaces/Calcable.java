package functional_interfaces;

@FunctionalInterface // SAM Single Abstract Method
public interface Calcable {
	
	// nur die Vorgabe. Lambda macht das dann
	long doCalc(int num1, int num2);
	static void doit1() {}
	default void doit2() {}
}
