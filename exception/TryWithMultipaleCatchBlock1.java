import java.util.*;

class TryWithMultipaleCatchBlock1
{
	public static void main(String arg[])
	{
		try 
		{
			System.out.println(10/0);		
		}
		catch (ArithmeticException ae)
		{	
			System.out.println("Arithmatic Eception Occur");	
		}
		catch (Exception e)
		{
			System.out.println("Exceptoin");		
		}
	}

}
