package javapackage;

class Bike 
{
	void travel()
	{
		System.out.println("Two members can travel");
	}
	void fuel()
	{
		System.out.println("Petrol");
	}
}
class Car extends Bike
{
	void ac()
	{
		System.out.println("Travel in AC");
	}
	void music_system()
	{
		System.out.println("While traveling users can listen music");
	}
}
class Vehicle
{
	void travellingvehicle(Car ref)
	{
		ref.ac();
		ref.music_system();
	}
}
public class Program4
{
public static void main(String[] args)
{
	Vehicle v1=new Vehicle();
	v1.travellingvehicle(new Car());	
}
}

