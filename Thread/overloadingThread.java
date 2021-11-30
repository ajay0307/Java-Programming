import java.util.*;


class Mythread extends Thread
{
	public void start()
	{
		super.start();
		System.out.println("start method");
	}
	public void run()
	{
		System.out.println("run method" );
	}
}

class overloadingThread 
{
	public static void main(String arg[])
	{
		Mythread t=new Mythread();
		t.start();
		System.out.println("Inside main");
	}
}

