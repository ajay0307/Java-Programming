import java.util.*;

class Display
{
	public void wish(String name)
	{
		synchronized(Display.class)
		{
		for(int i =0 ; i<10;i++)
		{
			System.out.print("Welcome:");
			try
			{
				Thread.sleep(2000);				
			}
			catch(InterruptedException e)
			{
							
			}	
			System.out.println(name);
		}

		}
			
	}
		
}

class Mythread extends Thread
{
	Display d;
	String name;
	Mythread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	
	public void run()
	{
		d.wish(name);	
	}
}

class SynchronizedClass
{
	public static void main(String arg[])
	{
	Display d = new Display();
	Display d1 = new Display();
	Mythread t = new Mythread(d,"Ajay");
	Mythread t1 = new Mythread(d1,"Shami");

	t.start();
	t1.start();
	}
	

}
