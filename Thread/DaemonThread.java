import java.util.*;
 
class Mythread extends Thread
{
	public void run()  
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException E){}
		}	
	}

}
class DaemonThread
{
public static void main(String arg[]) throws Exception
{
	Mythread t = new Mythread();
	t.setDaemon(true);
	t.start();
	
	
	System.out.println("End of Main thread");
}

}
