package exam.fahrzeug;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Fahrzeug f1 = new Traktor(10000, new Owner("Harald"));
		f1.drive(1000);
		
	}



}
