package javapackage;

class MobileV1
{
	long imeinum=2137652137L;
	void call()
	{
		System.out.println("Calling method.....");
	}
}
class MobileV2 extends MobileV1
{

}
class Shop
{
	MobileV1 sellMobile(int amt)
	{
		return new MobileV2();
	}
}
public class Program9 
{
	public static void main(String[] args) 
	{
		Shop s1=new Shop();
		MobileV1 ref=s1.sellMobile(50000);
	}
}