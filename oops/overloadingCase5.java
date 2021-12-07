import java.util.*;

class test
{
  
	  public void m1(int i,float f)
	{
	System.out.println("int-float Version");	
	}


	public void m1(float f,int i)
	{
	System.out.println("flaot-float  Version");	
	}
 
}

class overloadingCase5
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
		t.m1(10,1.5f);
		
		t.m1(2.5f,20);
		//t.m1(null); not allowed in this case
		
	}

}
