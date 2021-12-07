import java.util.*;

class IsDeomon_Check
{
	public static void main(String arg[])
	{
		IsDeamon_Check d = new IsDeamon_Check();
		System.out.println(Thread.currentThread().isDaemon());	
		//Thread.currentThread().setDaemon(true);//Exception in thread "main" java.lang.IllegalThreadStateException
		
		//System.out.println();
	}

}
