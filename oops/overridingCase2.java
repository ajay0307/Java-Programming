import java.util.*;
class p
{
	protected  void m1()//private is not acces in its child class 
	{
	System.out.println("parent");
	}
	

}
class c extends p
{
	public void m1()
	{
	System.out.println("child");
	}

}

class overridingCase2 //method overriding 
{
	public static void main(String arg[])
	{	
		p P = new p();
		p.m1();
	}


}
