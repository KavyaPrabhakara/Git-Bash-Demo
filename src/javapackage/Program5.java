package javapackage;

class BasicHandset
{
	void call()
	{
		System.out.println("Users can able to make call");
	}
	void message()
	{
		System.out.println("Users can able to message");
	}
}
class RedmiNote9 extends BasicHandset
{
	void rearCamera()
	{
		System.out.println("Users can take pictures");
	}
	void music()
	{
		System.out.println("Users can listen music");
	}
}
class Samsung extends RedmiNote9
{
	void quadRearCamera()
	{
		System.out.println("Users can take pictures with high quality");
	}
	void tripleFrontCamera()
	{
		System.out.println("Users can take selfies with high quality");
	}
}
class Phone
{
	void Handset(Samsung ref)
	{
		ref.quadRearCamera();
		ref.tripleFrontCamera();
		ref.music();
	}
}
public class Program5
{
public static void main(String[] args)
{
	Phone p1=new Phone();
	p1.Handset(new Samsung());	
}
}
