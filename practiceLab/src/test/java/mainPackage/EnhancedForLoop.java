package mainPackage;

public class EnhancedForLoop {
	public static void main(String[] args) 
	{
		EnhancedForLoop obj = new EnhancedForLoop();
		obj.singleDiamention();
		

	}
	public void singleDiamention()
	{
		int nums[] = {1,2,3};
		for (int i : nums) 
		{
			System.out.print(i+" ");			
		}
	}

}

