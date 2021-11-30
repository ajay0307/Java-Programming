import java.util.*;

class Mythread extends Thread
{
	static Thread th;
	public void run() 
	{
		try
		{
			th.join();
	
		}     
		catch(InterruptedException e)	
		{	
			System.out.println(e);
		}
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");		
		}
	}

}

class JoinThreadwait
{
	public static void main(String arg[]) throws Exception
	{
	Mythread.th = Thread.currentThread();
		
	Mythread t = new Mythread();
	
	t.start();
		
	   for(int i=0;i<10;i++)
             {
	
		System.out.println("Main Thread");
		Thread.sleep(2000);
	     }

	}
	

}
