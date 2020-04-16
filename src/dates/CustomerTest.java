package dates;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class CustomerTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetAge() {
		Customer customer = new Customer("Thierry", "Bitz", LocalDate.of(1988, 11, 18));
		assertEquals(31, customer.getAge());
	}
	
	@Test
	public void testGetAgeSameDay() {
		Customer customer = new Customer("Thierry", "Bitz", LocalDate.of(1988, 04, 16));
		assertEquals(32, customer.getAge());
	}

}
