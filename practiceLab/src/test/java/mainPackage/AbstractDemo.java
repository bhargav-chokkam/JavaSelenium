package mainPackage;
/*
 * If Class is Abstract, you cannot create object of it.
 * You can just declare a method without a body with abstract
 * If method is abstract then class also should be abstract
 * From Sub Class, we  must inherit super class abstract methods
 */

public class AbstractDemo {

	public static void main(String[] args) {
		AbstractClass obj = new NormalClass();
		obj.show();

	}

}

abstract class AbstractClass {
	public abstract void show();
}

class NormalClass extends AbstractClass {
	public void show() {
		System.out.println("Hello");
	}
}
