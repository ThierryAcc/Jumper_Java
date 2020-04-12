package misc;

public class Person {
	String vorname;
	String nachname;
	int alter;
	String email;
	String telefon;
	
	public Person(String vorname, String nachname, int alter) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
	}
	
	// AUFRUF DES ERSTEN KONSTRUKTORS
	public Person(String vorname, String nachname, int alter, String email, String telefon) {
		this(vorname, nachname, alter); // ruft Konstruktor auf.
		this.email = email;
		this.telefon = telefon;
	}	
	
}
