package mainPackage;
/*
 * @Override:
 * Indicates that a method declaration is intended to override a method declaration in a supertype.
 * If a method is annotated with this annotation type compilers are required to generate an error message
 * unless at least one of the following conditions hold:The method does override or implement a method declared
 * in a supertype.
 */

public class OverRidingDemo {

	public static void main(String[] args) {
		SubClass_OverRiding obj = new SubClass_OverRiding();
		obj.show();

	}

}

class SuperClass_OverRiding {
	public void show() {
		System.out.println("Super Class Method");

	}
}

class SubClass_OverRiding extends SuperClass_OverRiding {
	@Override
	public void show() {
		System.out.println("Sub Class Method");
	}

}
