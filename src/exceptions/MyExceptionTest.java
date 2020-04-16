package exceptions;

public class MyExceptionTest {

	public static void main(String[] args) {
		doit("problem");
		System.out.println("MAIN");
	}

	private static void doit(String str)  {
		try {
			doit2(str);
		} catch (MyException e) {
			System.out.println(e);
		} finally {
			System.out.println("AUFRÄUMEN - FINALLY");
		}
		
		System.out.println("DOIT");
	}

	private static void doit2(String str) throws MyException {
		doit3(str+"!!");
		System.out.println("after catch");
	}

	private static void doit3(String str) throws MyException {
		if (str!=null && str.equals("problem!!")) {
			throw new MyException("Wrong text");
		}
		System.out.println("rest");
	}

}
