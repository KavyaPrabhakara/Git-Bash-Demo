package javapackage;

interface Task
{
	void writing();
	void practising();
}
abstract class Task1 implements Task
{
	public void writing()
	{
		System.out.println("Writing notes");
	}
}
class Task2 extends Task1
{
	public void practising()
	{
		System.out.println("Practising concepts");
	}
}
public class Program1 
{
	public static void main(String[] args) 
	{
		Task2 t2=new Task2();
		t2.writing();
		t2.practising();
	}
}



