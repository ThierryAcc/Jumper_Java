package dates;

import java.time.LocalDate;
import java.time.Period;

public class Customer {
	private String firstName;
	private String lastName;
	private LocalDate birthday;

	public Customer(String firstName, String lastName, LocalDate birthday) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public int getAge() {
        if (birthday != null) {
            return Period.between(birthday, LocalDate.now()).getYears();
        } else {
            return 0;
        }
	}

	public LocalDate getBirthday() {
		return birthday;
	}

}
