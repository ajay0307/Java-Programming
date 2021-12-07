import java.util.*;

class A
{
	public int i =10;
	public  m1()
	{
	System.out.println("Inside parent");
	}	
}

 class B extends A
{
	public  m2()
	{
		System.out.println("Inside child b");
	}


}
class MultiLevelInheritance extends B
{
	public static void main(String arg[])	
	{	
		MultiLevelInheritance  mi = new MultiLevelInheritance();
		mi.m1();
		//System.out.println(si.i);
		mi.m2();
	}
}
