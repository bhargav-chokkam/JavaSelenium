package testngpackage;

import org.testng.annotations.Test;

public class BaseClass {
	@Test(priority = 1)
	public void AddTwoNumber() {

	}

	@Test(priority = 0)
	public void multTwoNumber() {
		System.out.println("Multiply Two Numbers");
		System.out.println(2 * 2);
	}
}
