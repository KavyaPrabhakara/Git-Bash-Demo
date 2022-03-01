package javapackage;

interface Tab
{
	void manufacturing();
	void testing();
}

abstract class Tab1 implements Tab
{
	public void manufacturing()
	{
		System.out.println("Manufacturing the product");	
	}
}
class Tab2 extends Tab1
{
	public void testing()
	{
		System.out.println("Testing the product");
	}
}
public class Program2
{	
	public static void main(String[] args)
	{
		Tab2 t2=new Tab2();
		t2.manufacturing();
		t2.testing();
	}
}
