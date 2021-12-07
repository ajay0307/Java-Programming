import java.util.*;

class test
{
  public void m1(Object o)
	{
	System.out.println("Object Version");	
	}
  public void m1(String s)
	{
	System.out.println("String Version");	
	}
 
}

class overloadingCase2
{
	//implimentation of method overloading in java
	//compiler resolution is responsible to run overloading 
	//overloading also known as 
				   //compile-time polymorphism
				   // early-binding polymorphism
				   // Static-binding polymorphism
	public static void main(String arg[])
	{
		test t = new test();
		t.m1(new Object());
		t.m1("Ajay");
		t.m1(null);//string version is called because child has highest priority
		
	}

}
