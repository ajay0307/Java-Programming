import java.util.*;


class Ranable implements Runnable 
{
	public void run()	
	{
		System.out.println("inside run");
	}
}

class MyRunnable 
{
	public static void main(String[] arg)
	{
	Ranable r = new Ranable();
	
	Thread t = new Thread();
	 
	Thread t1 = new Thread(r);
	t.start();	
	t.run();

	t1.start();
	t1.run();
	
	//r.start();
 	  r.run();//generate the Error 
	//for(int i=0;i<10;i++)
	//{

		System.out.println("inside main");
	//}
	}
}


