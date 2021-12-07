import java.io.*;

class ThrowsMultipleMethod
{
	public static void main(String []args) throws InterruptedException
	{
		dostuff();	
	}
	public static void dostuff() throws InterruptedException
	{
		domorestuff();	
	}
	public static void  domorestuff() throws InterruptedException
	{	
		Thread.sleep(1000);
	}
}
