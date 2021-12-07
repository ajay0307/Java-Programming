import java.util.*;

class test
{
  
	  public void m1(String s)
	{
	System.out.println("String Version");	
	}


	public void m1(StringBuffer sb)
	{
	System.out.println("StringBuffer Version");	
	}
 
}

class overloadingCase4
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

		t.m1("AjayString");
		t.m1(new StringBuffer("Ajay"));
		//t.m1(null);//CompileTime Error 
		
	}

}



