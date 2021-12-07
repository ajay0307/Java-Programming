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
			//e.printStackTrace(); //to print info about Exception 
			System.out.println(e);  // to print onle name of exception and Description
			System.out.println(e.toSting());/same as sop(e);
		  }	
		
	}


}
