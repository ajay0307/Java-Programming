import java.util.*;


class MyThread extends Thread 
{
	public void run()
	{
	System.out.println("run thread executed by:: "+Thread.currentThread().getName());
	}
	
}

class getThreadName 
{
	public static void main(String[] arg)
	{
		MyThread t = new MyThread();
		t.start();
		
		System.out.println("main thread executed by:: "+Thread.currentThread().getName());
	}
}


