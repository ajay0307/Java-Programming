import java.util.*;

       interface A
	{
	 public void m1();
	}

       interface B 
	{
	public void m1();
	}

class C implements A,B
{
	public void m1()
	{
		System.out.println("Iside C");
	}
}

class MultipleInterface
{
	public static void main(String arg[])	
	 {
	  C c = new C();
	  c.m1();
	 }

}
