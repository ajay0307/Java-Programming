import java.util.*;
import java.io.*;


//NULL Pointer Error Occured
class CCError	
{
	public static void main(String[] args)
	{
		String s = new String("Ajay");
		Object o = (Object)s; 
		
		Object ob = new String("Ajay");
		String s1=(String)ob;
		
		Object obj = new Object();	//Class Cast Error 
		String s2= (String)obj;

	
	}
}
