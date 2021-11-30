import java.util.*;

class SleepThread
{
	public static void main(String[] arg) throws  InterruptedException
	{
	  for(int i=0;i<10;i++)
		{
		 System.out.println("slides-"+i);
			Thread.sleep(1000);		
		}
	}

}
