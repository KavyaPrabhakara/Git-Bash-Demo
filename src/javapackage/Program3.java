package javapackage;

class Nonprimemembers
{
	void shopping()
	{
		System.out.println("Users can shop the products");
	}
}
class Primemembers extends Nonprimemembers
{
	void movies()
	{
		System.out.println("Prime members can watch latest movies");
	}
	void prime()
	{
		System.out.println("Prime members can purchase prime products");
	}
}
class Amazon
{
	void Normalaccount(Nonprimemembers ref)
	{
		ref.shopping();
	}
}
public class Program3
{
public static void main(String[] args)
{
	Amazon a1=new Amazon();
	a1.Normalaccount(new Nonprimemembers());	
}
}
