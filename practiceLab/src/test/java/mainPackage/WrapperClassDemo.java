package mainPackage;

public class WrapperClassDemo {

	public static void main(String[] args) {
		int num = 5;// Primitive data type
		Integer num2 = new Integer(10);// Wrapper Class
		Integer num3 = new Integer(num);// Boxing
		int num4 = num3.intValue();// UnBoxing
		/*
		 * Putting primitive data in obj is called Boxing/wrapping Putting obj data in
		 * Primitive data is called as unboxing/unwarpping
		 */
		String roll = "123";
		int rollNo = Integer.parseInt(roll);
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(roll);
		System.out.println(rollNo);

	}

}
