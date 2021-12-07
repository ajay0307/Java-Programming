import java.util.*;

class A
{
	public int i =10;
	public void  m1()
	{
	System.out.println("Inside parent");
	}	
}

 class B extends A
{
	public void   m2()
	{
		System.out.println("Inside child b");
	}


}
class MultiLevelInheritance extends B
{
	public static void main(String arg[])	
	{	
		MultiLevelInheritance  si = new MultiLevelInheritance();
		si.m1();
		//System.out.println(si.i);
		si.m2();
	}
}
