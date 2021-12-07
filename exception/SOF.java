import java.util.*;


//Stack Over Flow Error Occured
class SOF	
{
	public static void m2()
	{
		m1();	
	}
	public static void m1()
	{
		m2();	
	}
	public static void main(String arg[])
	{
		m1();
	}

}
