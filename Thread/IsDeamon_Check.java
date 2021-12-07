import java.util.*;

class Mythread extends Thread
{

}

class IsDeamon_Check
{
	public static void main(String arg[])
	{
		
		System.out.println("Main current Thread : "+Thread.currentThread().isDaemon());	
		//Thread.currentThread().setDaemon(true);//Exception in thread "main" java.lang.IllegalThreadStateException
			Mythread t = new Mythread();
		System.out.println("CHILD Thread : "+t.isDaemon());
		t.setDaemon(true);


		System.out.println("After Changing Thread : "+t.isDaemon());
	}

}
