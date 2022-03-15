package mainPackage;

public class InheritanceDemo {

	public static void main(String[] args) {
		Substraction obj = new Substraction();
		System.out.println("Sum of 2 and 2 is :" + obj.add(2, 2));
		System.out.println("Substraction of 2 and 2 is :" + obj.sub(2, 2));

	}

}

class Addition {// Super Class
	public int add(int... n) {
		int sum = 0;
		for (int i : n) {
			sum = sum + i;
		}
		return sum;
	}
}

class Substraction extends Addition {// Sub Class
	public int sub(int... n) {
		int sum;
		for (int i : n) {
			sum = i;
		}
		return sum;
	}
}
