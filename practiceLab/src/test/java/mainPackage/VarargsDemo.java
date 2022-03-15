package mainPackage;
/*
 * Varargs is like passing Array
 * Variable Length Arguments
 */

public class VarargsDemo {

	public static void main(String[] args) {
		VarargsDemo obj = new VarargsDemo();
		System.out.println("Sum is: " + obj.add(5, 4, 3));

	}

	public int add(int... n) {
		int sum = 0;
		for (int i : n) {
			sum = sum + i;
		}
		return sum;
	}

}
