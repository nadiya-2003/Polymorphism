class Calculator
{
	int add(int a,int b)
	{
		return a+b;
	}
	int  add(int a,int b,int c)
	{
		return a+b+c;
	}
	float add(float a,float b)
	{
		return a+b;
	}
	float add(float a,float b,float c)
	{
		return a+b+c;
	}
	double add(double a,double b,double c)
	{
		return a+b+c;
	}
	double add(int a,double b,float c)
	{
		return a+b+c;
	}
}
public class Sample {
	public static void main(String[] args) {
		Calculator c=new Calculator();
		System.out.println(c.add(5,10));
		System.out.println(c.add(5,10,15));
		System.out.println(c.add(5.3f,10.66f));
		System.out.println(c.add(9.55,20.55,8.3));
		System.out.println(c.add(500.66,10000.44,600.48));
		System.out.println(c.add(8,1000.6,6.2f));
	}
}
