package misc;

public class Boxing {
	public static void main(String[] args) {
		Integer noPooling = new Integer(128);
		Integer pooled = 100;
		
		Integer i1 = 100; // pooled - autoboxing
		Integer i2 = 100;
		
		int smalli = i2;
		
		Integer i3 = 128; // nopooled
		Integer i4 = 128;
		
		Integer i5 = -129; // nopooled
		Integer i6 = -129;
		
		int v1 = 100;
		int v2 = 128;
		
		System.out.println(i1 == i2);
		System.out.println(i1 == v1);
		
		System.out.println(i3 == i4); // über dem Integer-Pool
		System.out.println(i3 == v2);
		
		System.out.println(noPooling.equals(i3));
		System.out.println(noPooling == i3);
		System.out.println(pooled == i2);
	
	}
}
