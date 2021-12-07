package a1;
import java.util.*;
class c	
{
	protected void m2()
	{
		System.out.println("c class protected Method");	
	}
}

 class A
{
	protected void m1()
	{
		System.out.println("A class protected Method");	
	}
}
class ProtectJava extends A
{
public static void main(String arg[])
{
	A a = new A();
	a.m1();
	
	ProtectJava b = new ProtectJava();
	b.m1();
	
	A a1 = new ProtectJava();
	a1.m1();
	
	c C = new c();
	C.m2();
}
}
