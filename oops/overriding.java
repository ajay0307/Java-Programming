import java.util.*;
class a
{
	public void property()
	{
	System.out.println("cash gold land");
	}
	public void marry()
	{
	System.out.println("sona /mona");
	}

}
class b extends a
{
	public void marry()
	{
	System.out.println("rinku");
	}
	public void property(){
		System.out.println("demo");
	}
}
class overriding //method overriding 
{
	public static void main(String arg[])
	{	
		a A = new a();
		 A.marry();
		b B = new b();
		B.marry();
		a a1 = new b();
		a1.marry();
		a1.property();
		
	}


}
