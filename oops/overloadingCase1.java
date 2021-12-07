import java.util.*;

class test
{
  public void m1()
	{
	System.out.println("without any argument");	
	}
  public void m1(int a)
	{
	System.out.println("with int argument"+a);	
	}
  public void m1(int a, int b)
	{
	System.out.println("with int,int argument"+b);	
	}
  public void m1(double d)
	{
	System.out.println("with double argument"+d);	
	}
  public void m1(char c)
	{
	System.out.println("with char argument"+c);	
	}


}

class overloadingCase1
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
		t.m1();
		t.m1(10);
		t.m1(10,5);
		t.m1(10.5);
		t.m1('a');
	}

}
