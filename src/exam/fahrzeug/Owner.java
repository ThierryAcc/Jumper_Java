package exam.fahrzeug;

public class Owner {
	private String firstName;

	public Owner(String firstName) {
		super();
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Owner [firstName=" + firstName + "]";
	}
	
}
