package javapackage;

interface ATM
{
	void withdraw();
	void checkbalance();
}
class SBIATM implements ATM
{
	int PIN;
	double balance;
	public SBIATM(int PIN, double balance)
	{	
		this.PIN=PIN;
		this.balance=balance;
	}
	public void withdraw()
	{
		System.out.println("Insert the card into SBI bank ATM machine");
		System.out.println("Enter the PIN");
		System.out.println("Connect to bank");
		System.out.println("Withdraw the money");
	}
	public void checkbalance()
	{
		System.out.println("Balance Amount="+balance);
	}
}
class HDFCATM implements ATM
{
	int PIN;
	double balance;
	public HDFCATM(int PIN, double balance)
	{	
		this.PIN=PIN;
		this.balance=balance;
	}
	public void withdraw()
	{
		System.out.println("Insert the card into HDFC bank ATM machine");
		System.out.println("Enter the PIN");
		System.out.println("Connect to bank");
		System.out.println("Withdraw the money");
	}
	public void checkbalance()
	{
		System.out.println("Balance Amount="+balance);
	}
}
class ATMMachine
{
	ATM select(char bank)
	{
		if(bank=='s')
		{
			return new SBIATM(7878, 45000);
		}
		else
		{
			return new HDFCATM(8568, 80000);
		}
	}
}
public class Program11
{
public static void main(String[] args)
{
	ATMMachine am=new ATMMachine();
	ATM ref=am.select(' ');
	ref.withdraw();
	ref.checkbalance();	
}
}

