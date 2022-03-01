package javapackage;

class MusicalInstrument
{
	void play()
	{
		System.out.println("Play Music");
	}
}
class Guitar extends MusicalInstrument
{
	void play()
	{
		System.out.println("Play Music using Guitar");
	}
}
class Piano extends MusicalInstrument
{
	void play()
	{
		System.out.println("Play Music using Piano");
	}
}
class Flute extends MusicalInstrument
{
	void play()
	{
		System.out.println("Play Music using Flute");
	}
}
class User
{
	void playmusic(MusicalInstrument ref) 
	{
		ref.play();
	}
}
public class Program8 
{
	public static void main(String[] args) 
	{
		User c1=new User();
		c1.playmusic(new Guitar());
		c1.playmusic(new Piano());
		c1.playmusic(new Flute());
	}
}
