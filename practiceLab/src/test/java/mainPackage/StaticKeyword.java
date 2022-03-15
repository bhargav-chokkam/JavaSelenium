package mainPackage;
/*
 * Static Variable: It holds same data for all the object reference
 * We don't need an object to call a method or variable
 * Constructor method executes when object is created but whereas Static method executes only once
 */


class StaticExample
{
	static 
	{
		System.out.println("Static Method");
	}
}
public class StaticKeyword {
	public static void main(String[] args) 
	{
		System.out.println("Hello");
		
	}

}
