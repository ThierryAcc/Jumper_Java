package misc.enums;

public enum MyEnum {
	SHOES(0.19), HATS(12), PANTS(3);
	

	private MyEnum(double vat) {
		this.vat = vat;
	}
	
	final double vat;
	
	public double getVat() {
		return vat;
	}
		
}
