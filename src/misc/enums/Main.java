package misc.enums;

public class Main {

	public static void main(String[] args) {
		MyEnum hats = MyEnum.SHOES;
		System.out.println(hats);
		System.out.println(hats.getVat());
		
		for (MyEnum en : MyEnum.values()) {
			System.out.println(en);
			System.out.println(en.getVat());
		}
	}

}
