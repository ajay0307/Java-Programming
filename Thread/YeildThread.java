import java.util.*;

class Mythread extends Thread
{
	public void run()
	{
		for (int i=0;i<10;i++)
		{
			System.out.println("inside child thread");	
			//Thread.yield();	
		}
	
	}

}

class YeildThread
{
	public static void main(String[] arg)
	{
		Mythread t= new Mythread();
		t.start();	
		
		for(int i=0;i<10;i++)
		{
			System.out.println("inside main thread");	
		}

	}

}
