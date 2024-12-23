class Bank
{
	
	int getrateofInterest()
	{
		return 0;
	}
}
class SBI extends Bank
{
	@Override 
	int getrateofInterest()
	{
		return 9;
	}
}
class AXIS extends Bank
{
	@Override
	int getrateofInterest()
	{
		return 8;
	}
}
class HDFC extends Bank
{   @Override
	int getrateofInterest()
	{
		return 7;
	}
}
public class SampleMethodOveriding
{
	public static void main(String[] args)
	{
		SBI b=new SBI();
		AXIS a=new AXIS();
		HDFC h=new HDFC();
		System.out.println("the rate of interest of SBI is:"+b.getrateofInterest());
		System.out.println("the rate of interest of AXIS is:"+a.getrateofInterest());
		System.out.println("the rate of interest of HDFC is:"+h.getrateofInterest());
	}
}
