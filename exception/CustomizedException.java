import java.io.*;
import java.util.*;


//consider matermoney side 
class TooYoungException extends RuntimeException
{
	TooYoungException(String msg)
	{
		super(msg);//to make our description to the 
	
	}
}
class TooOldException extends RuntimeException
{
	TooOldException(String msg)
	{
		super( msg);
	}
}

class CustomizedException
{
	public static void main(String args[])
		{
			int age= Integer.parseInt(args[0]);

			if(age>60)
			{
				throw new TooYoungException("Please wait some more time");			
			}
			else if(age<16)
			{
				throw new TooOldException("Age is too young ");			
			}
			else
			{
				System.out.println("reGISTATION sucesfully");			
			}
		}

}
