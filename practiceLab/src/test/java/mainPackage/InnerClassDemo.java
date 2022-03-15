package mainPackage;

/*
 * Adding Class inside Class
 */
class OuterClass {
	// This is my Outer Class
	public void methodOfOuterClass() {
		System.out.println("Outer Class");
	}

	class InnerClass {
		// This is my Inner Class created in Outer Class
		public void methodOfInnerClass() {
			System.out.println("Inner Class");
		}
	}
}

public class InnerClassDemo {
	public static void main(String[] args) {
		OuterClass objO = new OuterClass();
		// To create object for Inner Class, we use reference of Outer Class
		// If Inner Class is Static,We should use class reference for constructor
		// instead of object
		// OuterClass.InnerClass onjI = new OuterClass.InnerClass();
		OuterClass.InnerClass objI = objO.new InnerClass();
		objO.methodOfOuterClass();
		objI.methodOfInnerClass();

	}

}
