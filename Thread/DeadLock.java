import java.util.*;

class A
{
	public synchronized void d1(B b)
	{
		System.out.println("Thread start Execution of d1()");
		try 
		{
			Thread.sleep(6000);		
		}	
		catch(InterruptedException ie){}
		
		System.out.println("Thread 1 trying to call B's Last()");	
		b.lost();
	}
	public synchronized void lost()
	{
		System.out.println("Inside a ,this is last() ");	
		
	}	
}
class B
{
	public synchronized void d2(A a)
	{
		System.out.println("Thread start Execution of d2()");
		try
		{
			Thread.sleep(6000);
		}
		catch(InterruptedException ie){}
		
		System.out.println("Thread 2 Trying to call A's Last()");
		a.lost();	
	}
	public synchronized void lost()
	{
		System.out.println("inside b ,this is last()");	
	}

}



class DeadLock extends Thread
{
	A a = new A();
	B b = new B();	

	public void m1()
	{
		this.start();
		a.d1(b);		
	}
	
	public void run()
	{
		b.d2(a);
	}
	public static void main(String arg[])
	{
		DeadLock d = new DeadLock();
		d.m1();
	}


}
