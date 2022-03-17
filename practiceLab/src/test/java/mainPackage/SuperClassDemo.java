package mainPackage;
/*
 * When we create object of sub class, it will call both constructors of sub class and super class
 * To execute super class method which is not a constructor use : super.show();
 * To use super class variable use: super.variable
 */

public class SuperClassDemo {
	public static void main(String[] args) {
		SubClass obj = new SubClass();
	}
}

class SuperClass {
	public SuperClass() {
		System.out.println("Super Class Method");
	}

	public SuperClass(int num) {
		System.out.println("Super Class Method " + num + " is Passed");
	}
}

class SubClass extends SuperClass {
	public SubClass() {
		System.out.println("Sub Class Method");
	}

	public SubClass(int num) {
		super(num);
		System.out.println("Sub Class Method " + num + " is Passed");
	}

}
