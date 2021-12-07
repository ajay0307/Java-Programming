import java.util.*;

class A
{
	public void m1()
	{
		System.out.println("Parent method called");	
	}
}
class B extends A
{
	public void m2()
	{
		System.out.println("Child mehod called");	
	}	
}

class Inheritance
{
	public static void main(String arg[])
	{
		A a = new A();
		a.m1();
		//a.m2();//this is not allowed 
		B b = new B();
		b.m1();
		b.m2();
		
		A a1 = new B();
		a1.m1();
		//a1.m2();
	
		/*B b1 =  new A(); // this not allowd 
		b1.m1();
		b1.m2();*/

		}

}
