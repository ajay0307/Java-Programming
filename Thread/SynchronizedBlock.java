import java.util.*;

class Display
{
	public void display(String name)
	{	//consider here 1thousand line of code 
		synchronized(this)//this is the block sychronized concept s
		{
		 for(int i=0;i<10;i++)
		{
			System.out.print("Good Evening:");
			try 
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{}	
			System.out.println(name);
		}
		////And asle hererconsider here 1thousand line of code 
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
		d.display(name);	
	}
}

class SynchronizedBlock
{
	public static void main(String args[])
	{
		Display d = new Display();
		Mythread t=new Mythread(d,"Ajay");
		Mythread t1=new Mythread(d,"ThomasEdisan");

		t.start();
		t1.start();
	}
}
