import java.util.*;

class A
{
	public int i =10;
	public void  m1()
	{
	System.out.println("Inside parent A");
	}	
}

 class B extends A
{
	public void   m2()
	{
		System.out.println("Inside child B");
	}


}
class C extends A
{
	public void m3()
	{
		System.out.println("Inside child C");	
	}

}

class HirarchicalInheritance 
{
	public static void main(String arg[])	
	{	
		C  si = new C();
		si.m1();
		//System.out.println(si.i);
		//si.m2();
		si.m3();
		
		B b = new B();
		b.m1();
		b.m2();
		//b.m3();
		
		
	}
}
