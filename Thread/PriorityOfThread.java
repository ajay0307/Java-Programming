import java.util.*;

class Mythread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		System.out.println("inside Child thread");	
	}

}

class PriorityOfThread
{
	public static void main(String[] arg)
	{
		Mythread t = new Mythread();
		t.setPriority(10);
		t.start();
		
		for(int i=0;i<10;i++)
		{


		 System.out.println("inside main thread");	
		}
	}


}
