
class Creature
{
	void sound()
	{
		System.out.println("Animal Makes Sound");
	}
}
class Dog extends Creature
{
	void sound()
	{
			System.out.println("The Sound was very growl");
	}	
}
public class Animal
{
public static void main(String args[])
	{
		Creature a=new Creature();
		Creature b=new Dog();
		a.sound();
		b.sound();
	}
}
