import java.util.*;
class p
{
	protected  void m1()//final is not ovveriden 
	{
	System.out.println("parent");
	}
	

}
class c extends p
{
	public  void m1()
	{
	System.out.println("child");
	}

}


class overridingCase3 //method overriding 
{
	public static void main(String arg[])
	{	
		p P = new p();
		p p1 = new c();
		p1.m1();
		P.m1();
	}


}
