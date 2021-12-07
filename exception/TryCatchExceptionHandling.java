import java.util.*;

class TryCatchExceptionHandling
{
	public static void main(String arg[])
	{
	System.out.println("Jay Ganesh");
	
	try 
	  {
		System.out.println(10/0);
	  }
	catch (ArithmeticException e)
	  {
		System.out.println(10/2);
	  }	
	System.out.println("Stmt-3");
	}

}
