package javapackage;

interface OnlineShopping
{
	void search();
	void order();
}
class Mynthra implements OnlineShopping
{
	long phone_number;
	String address;
	public Mynthra(long phone_number,String address)
	{	
		this.phone_number=phone_number;
		this.address=address;
	}
	public void search()
	{
		System.out.println("Install Mynthra application");
		System.out.println("Search the products");
		System.out.println("Add to cart");
	}
	public void order()
	{
		System.out.println("Enter the information");
		System.out.println("Order the product using Mynthra application");
	}	
}
class Ajio implements OnlineShopping
{
	long phone_number;
	String address;
	public Ajio(long phone_number,String address)
	{	
		this.phone_number=phone_number;
		this.address=address;
	}
	public void search()
	{
		System.out.println("Install Ajio application");
		System.out.println("Search the products");
		System.out.println("Add to cart");
	}
	public void order()
	{
		System.out.println("Enter the information");
		System.out.println("Order the product using Ajio application");
	}	
}
class Shopping
{
	OnlineShopping select(char app)
	{
		if(app=='m')
		{
			return new Mynthra(6784594785L, "Delhi");
		}
		else
		{
			return new Ajio(7894571235L, "Mysuru");
		}
	}
}
public class Program12
{
public static void main(String[] args)
{
	Shopping s=new Shopping();
	OnlineShopping ref=s.select('s');
	ref.search();
	ref.order();	
}
}

