package mainPackage;
/*
 * Static Variable: It holds same data for all the object reference
 * We don't need an object to call a method or variable
 * Constructor method executes when object is created but whereas Static method executes only once
 */

class StaticExample {
	int empId;
	String name;
	static String lead;
	static {
		System.out.println("Static Method");
		lead = "Prashant";
	}

	public void show() {
		System.out.println("ID:" + empId + " Name:" + name + " Lead:" + lead);
	}
}

public class StaticKeyword {
	public static void main(String[] args) {
		System.out.println("Hello");
		StaticExample emp1 = new StaticExample();
		StaticExample emp2 = new StaticExample();
		emp1.empId = 1686198;
		emp1.name = "bhargav";
		emp2.empId = 1685688;
		emp2.name = "Koumya";
//		emp1.lead = "Ashok";
//		emp2.lead = "Kishore";
		emp1.show();
		emp2.show();

	}

}
