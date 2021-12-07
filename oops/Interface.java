import java.util.*;


 interface inter
{
	public void m1();
	  public void m2();

}

class Inter implements inter
{
	public void m1()
		{
			System.out.println("Hello");
		}
 	public void m2()
	{
		System.out.println("from second method");	
	}
}

class Interface extends Inter 
{
	public static void main(String[] arg)
	{
		Interface i = new Interface();
		i.m1();
		i.m2();
	}

}
