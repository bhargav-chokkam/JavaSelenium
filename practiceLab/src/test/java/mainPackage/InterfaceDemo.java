package mainPackage;
/*
 * Interface is same like abstract class but you can't declare a method
 * If you want use super class, we use extends
 * But if we want to use interface, we use implements
 * Can't create object of interface
 * We can use multiple interfaces unlike extends
 */

public class InterfaceDemo {

	public static void main(String[] args) {
		ImplementClass obj = new ImplementClass();
		obj.show();
		obj.display();
	}
}

interface InterfaceClassA {
	public abstract void show();
}

interface InterfaceClassB {
	public abstract void display();
}

class ImplementClass implements InterfaceClassA, InterfaceClassB {
	public void show() {
		System.out.println("Inhertied First Interface Method Show()");
	}

	public void display() {
		System.out.println("Inhertied Secound Interface Method Display()");
	}
}
