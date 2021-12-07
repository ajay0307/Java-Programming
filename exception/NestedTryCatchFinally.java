import java.util.*;

class NestedTryCatchFinally 
{
	public static void main(String arg[])
	{
		try 
		  {
			System.out.println("Outer Try Block Executed");//1
			try
			  {
				System.out.println("Inner try Block Executed");//2
				System.out.println(10/0);//3
			  }
			catch (Exception e)
			  {
				System.out.println("Inner Catch Block Executed");//4
			  }

			System.out.println("End Of Outer Try BLock");//5
		  }
		catch(Exception e)	
		  {
		  	System.out.println("Outer Catch Block Executed");
  		  }
		finally
		  {
			System.out.println("Outer Finally block Executed");//6
		  }

	}

}
