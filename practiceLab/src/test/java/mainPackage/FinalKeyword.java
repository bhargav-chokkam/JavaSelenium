package mainPackage;
/*
 * Once Variable is assigned with final keyword, you can't modify(Constant)
 * Once class defined with final keyword,you can't inherit from other class
 * once method is declared with final, you can't override that method
 * 
 */

public class FinalKeyword {

	public static void main(String[] args) {

		final int constant;
		constant = 34;
//		below declaration trying to modify the constant variable which shows compile error
//		constant = 23;
		ClassSampleB obj = new ClassSampleB();
		obj.show();

	}

}

//final class ClassSampleA
class ClassSampleA {
	public void show()
//	public final void show()
	{
		System.out.println("Class A");
	}
}

class ClassSampleB extends ClassSampleA {
	public void show() {
		System.out.println("Class B");

	}
}
