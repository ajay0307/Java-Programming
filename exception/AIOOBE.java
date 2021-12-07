import java.util.*;

class AIOOBE
{
	public static void main(String arg[])
	{
		int [] a =new int[10];
		
		System.out.println(a[0]);
		System.out.println(a[9]);
	
		System.out.println(a[100]);//Array Out OF Bond Error Occured
		System.out.println(a[-100]);
	}

}
