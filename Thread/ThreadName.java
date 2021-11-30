import java.util.*;


class MyThread extends Thread 
{
	
}

class ThreadName 
{
	public static void main(String[] arg)
	{
		System.out.println(Thread.currentThread().getName());
		
		MyThread t = new MyThread();
		
		System.out.println(t.getName());
		


		//Thread currentThread.setName("Jay Ganesh");
		Thread.currentThread().setName("Jay Ganesh");
		System.out.println(Thread.currentThread().getName());
	}
}


