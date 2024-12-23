
public class SampleMethodOverload {
		public void color()
		{
			System.out.println("Yellow");
		}
		public void color(String abc,String abd)
		{
			System.out.println(abc);
			System.out.println(abd);
		}

public static void main(String[] args) 
{
		SampleMethodOverload s=new SampleMethodOverload();
		s.color();
		s.color("Black","Blue");
}

}