import java.util.*;

class MethodsofExcpInfo
{
	public static void main(String arg[])
	{
		try 
		  {
			System.out.println(10/0);
		  }
		catch(ArithmeticException e)
		  {
			e.printStackTrace(); //to print info about Exception 
			System.out.println(e);  // to print only name of exception and Description
			System.out.println(e.toString());//same as sop(e);
			System.out.println(e.getMessage());
			
		  }	
		
	}


}
