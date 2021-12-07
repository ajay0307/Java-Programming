import java.lang.*;

class Display
{
	public synchronized void Wish(String name)
	{
		for(int i=0;i<10;i++)
		{
		System.out.print("Good Morning:");
			try
			{
				Thread.sleep(200);
			}
			catch(InterruptedException e){}
	
		System.out.println(name);	
		}
	}
}

class Mythread extends Thread
{
	Display d;
	String name;
	Mythread(Display d,String name)
	{
		this.d = d;
		this.name = name;	
	}
	public void run()
	{
		d.Wish(name);
	}

}



class SynchronizedDemo
{
	public static void main(String arg[])
	{
		Display d = new Display();
		Mythread t1 = new Mythread(d,"Ajay");
		Mythread t2 = new Mythread(d,"Dom");
		Mythread t3 = new Mythread(d,"Alena");
		Mythread t4 = new Mythread(d,"Ronaldo");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	} 

}
