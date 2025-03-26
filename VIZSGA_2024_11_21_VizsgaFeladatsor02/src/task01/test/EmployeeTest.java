package task01.test;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


import task01.app.Employee;

public class EmployeeTest {

	@Test
	public void testUserStatusTextActive() {
		Employee employee = new Employee("Elek", "Teszt", "tesztelek", LocalDate.of(1999, 01,01), true);
		String actual = employee.getStatusText();
		String expected = "Aktív";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testUserStatusTextInactive() {
		Employee employee = new Employee("Elek", "Teszt", "tesztelek", LocalDate.of(1999, 01,01), false);
		String actual = employee.getStatusText();
		String expected = "Inaktív";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
    public void testDateFormate() {
		Employee employee = new Employee("Elek", "Teszt", "tesztelek", LocalDate.of(1999, 01, 01), true);
		LocalDate actual = employee.getDateOfBirth();
		LocalDate expected = LocalDate.of(1999, 01, 01);
		Assert.assertEquals(expected, actual);
	}
}
