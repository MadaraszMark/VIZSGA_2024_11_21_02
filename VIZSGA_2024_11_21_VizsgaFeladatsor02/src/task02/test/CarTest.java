package task02.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import task02.app.Car;

public class CarTest {

	@Test
	public void isOldTest() {
		Car car = new Car("BestCarFor4U", 2020, "fehér", "TRE-4456");
		Boolean actual = car.isOld();
		Boolean expected = false;
		Assert.assertEquals(expected, actual);
	}
}
