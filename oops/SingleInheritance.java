import java.util.*;

class A
{
	public int i =10;
	public void m1()
	{
	System.out.println("Inside parent");
	}	
}
class SingleInheritance	extends A
{
	public static void main(String arg[])	
	{	
		SingleInheritance  si = new SingleInheritance();
		si.m1();
		System.out.println(si.i);
	}
}
