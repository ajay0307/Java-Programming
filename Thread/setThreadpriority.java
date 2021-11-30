import java.util.*;

class Mythread extends Thread
{


}

class setThreadpriority
{
	public static void main(String[] arg)
	{
		System.out.println(Thread.currentThread().getPriority());
		Mythread t =  new Mythread();
		
		System.out.println(t.getPriority());
		//t.setPriority(13);//priotiry is 1 to 10 if we write above then we get the error
		System.out.println(t.getPriority());
	}


}
