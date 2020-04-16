package exceptions;

public class CalcTest {

	public static void main(String[] args) {
		if (args.length == 2) {
			int num1;
			int num2;

			try {
				num1 = Integer.parseInt(args[0]);
				num2 = Integer.parseInt(args[1]);
				System.out.println(num1 + num2);
			} catch (NumberFormatException e) {
				System.out.println("CAUGHT " + e);
				System.out.println("invalid args");
			} catch (Exception e) {
				System.out.println("irgendwas");
			}
		}
	}

}
