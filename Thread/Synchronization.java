import java.util.*;

class Mythread extends Thread
{
	int total=0;
	public void run()
	{
		//int total = 0;

		synchronized(this)
		{
			System.out.println("child thread starts calculation ");
		for(int i=1;i<=100;i++)
		{
			total = total +i;
			
		}
		  System.out.println("Child giving notification call");
		
		this.notify();

		}	
	}

}
class Sysnchronization
{
	public static void main(String arg[]) throws Exception
	{
		Mythread t = new Mythread();
		t.start();
		
		synchronized(t)
		{
			System.out.println("main thread calling wait()");
			
			t.wait();

			System.out.println("main thread got notification call ");
			
			System.out.println(t.total);
		}
	}

}
