import java.util.*;

class Mythread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("seeta thread");
			try
			{		
				Thread.sleep(1000);	
			}
			catch(InterruptedException e)
			{
				//System.out.println(e);
			}
		}
	}
}

class JoinThread //
{
	public static void main(String arg[]) throws Exception
	{
		Mythread t=new Mythread();
		
		t.start();
		t.join(2000);
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Ram Thread");		
		}	
	}


}
