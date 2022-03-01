package javapackage;

class College
{
	void admission()
	{
		System.out.println("Student admission");
	}
}
class NIE extends College
{
	void admission()
	{
		System.out.println("Student admission in NIE college");
	}
}
class JCE extends College
{
	void admission()
	{
		System.out.println("Student admission in JCE college");
	}
}
class MIT extends College
{
	void admission()
	{
		System.out.println("Student admission in MIT college");
	}
}
class Student
{
	void study(College ref) 
	{
		ref.admission();
	}
}
public class Program7 
{
	public static void main(String[] args) 
	{
		Student c1=new Student();
		c1.study(new NIE());
		c1.study(new JCE());
		c1.study(new MIT());
	}
}
