package javapackage;

interface UPITransction
{
	void transferMoney();
	void receivemoney();
	void checkbalance();
}

class GPay implements UPITransction
{
	long contactNumber;
	String upiId;
	double bankBalance;
	public GPay(long contactNumber, String upiId, double bankBalance)
	{	
		this.contactNumber = contactNumber;
		this.upiId = upiId;
		this.bankBalance = bankBalance;
	}
	public void transferMoney()
	{
		System.out.println("get the contact details from Gpay ");
		System.out.println("connect to the bank server securely");
		System.out.println("connect both reciver and sender banks ");
		System.out.println("transfer the money secure");
	}
	public void receivemoney()
	{
		System.out.println("get the contact details from Gpay ");
		System.out.println("connect to the bank server securely");
		System.out.println("connect both reciver and sender banks ");
		System.out.println("recive the money securely");
		System.out.println("deposit the money securely");
	}
	public void checkbalance()
	{
		System.out.println("the bank balance="+bankBalance);
	}
	
}
class Phonepe implements UPITransction
{
	long contactNumber;
	String upiId;
	double bankBalance;
	public Phonepe(long contactNumber, String upiId, double bankBalance)
	{	
		this.contactNumber = contactNumber;
		this.upiId = upiId;
		this.bankBalance = bankBalance;
	}
	public void transferMoney()
	{
		System.out.println("get the contact details from Phonepe");
		System.out.println("connect to the bank server securely");
		System.out.println("connect both reciver and sender banks ");
		System.out.println("transfer the money secure");
	}
	public void receivemoney()
	{
		System.out.println("get the contact details from Phonepe");
		System.out.println("connect to the bank server securely");
		System.out.println("connect both reciver and sender banks ");
		System.out.println("recive the money securely");
		System.out.println("deposit the money securely");
	}
	public void checkbalance()
	{
		System.out.println("the bank balance="+bankBalance);
	}
	
}

class Playstore
{
	UPITransction download(char type)
	{
		if(type== 'g')
		{
			return new GPay(12365415L, "java@yes.com", 5000);
		}
		else
		{
			return new Phonepe(12365415L, "testing@hdfc", 5000);
		}
	}
}

public class Program10
{
public static void main(String[] args)
{
	Playstore ps=new Playstore();
	UPITransction ref=ps.download('p');
	ref.transferMoney();
	ref.checkbalance();
	ref.receivemoney();
	ref.checkbalance();	
}
}

