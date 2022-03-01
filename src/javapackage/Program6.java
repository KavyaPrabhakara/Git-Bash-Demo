package javapackage;

class TravellingApp
{
	void bookride()
	{
		System.out.println("U can travel");
	}
}
class Uber extends TravellingApp
{
	void bookride()
	{
		System.out.println("U can travel using Uber application");
	}
}
class Ola extends TravellingApp
{
	void bookride()
	{
		System.out.println("U can travel using Ola application");
	}
}
class Drivezy extends TravellingApp
{
	void bookride()
	{
		System.out.println("U can travel using Drivezy application");
	}
}
class Customer
{
	void travel(TravellingApp ref) 
	{
		ref.bookride();
	}
}
public class Program6 
{
	public static void main(String[] args) 
	{
		Customer c1=new Customer();
		c1.travel(new Uber());
		c1.travel(new Ola());
		c1.travel(new Drivezy());
	}
}
