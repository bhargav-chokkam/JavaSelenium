package mainPackage;

public class EnhancedForLoop {
	public static void main(String[] args) {
		EnhancedForLoop obj = new EnhancedForLoop();
		obj.singleDiamention();
		obj.multiDiemention();

	}

	public void singleDiamention() {
		int nums[] = { 1, 2, 3 };
		for (int i : nums) {
			System.out.println(i + " ");
		}
	}

	public void multiDiemention() {
		System.out.println("Multi Diamention Array");
		int sampleNumbers[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i[] : sampleNumbers) {
			for (int j : i) {
				System.out.print(j);
			}
			System.out.println(" ");

		}
	}

}
