import java.util.*;

class TryWithMultipaleCatchBlock
{
	
	public static void main(String arg[])
	{
	try 
	{	
		System.out.println(10/0);		
	}
	catch (Exception e)
	{
		System.out.println("Exception");
	}
	catch(ArithmeticException ae)
	{
		System.out.println("ArithmeticExxception");	
	}
	}


}
