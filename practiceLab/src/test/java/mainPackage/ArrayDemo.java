package mainPackage;

class ArrayDemo {
	public static void main(String[] args) {
		ArrayDemo obj = new ArrayDemo();
		obj.singleDiamention();
		obj.multiDiemention();
		obj.jaggedArray();
	}

	public void singleDiamention() {
		System.out.println("Single Diamention Array");
		int rollNo[] = { 1, 2, 3 };
		for (int i = 0; i < rollNo.length; i++) {
			System.out.println(i);
		}

	}

	public void multiDiemention() {
		System.out.println("Multi Diamention Array");
		int sampleNumbers[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(sampleNumbers[i][j] + " ");
			}
			System.out.println(" ");

		}
	}

	public void jaggedArray() {
		System.out.println("Jagged Array");
		int sampleNumbers[][] = { { 1, 3 }, { 4, 5, 6, 9, 10 }, { 7, 8, 9 } };
		for (int i = 0; i < sampleNumbers.length; i++) {
			for (int j = 0; j < sampleNumbers[i].length; j++) {
				System.out.print(sampleNumbers[i][j] + " ");
			}
			System.out.println(" ");

		}
	}
}