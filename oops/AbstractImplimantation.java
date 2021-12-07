import java.util.*;


 abstract class AbstractImplimantation 
{
	public static void main(String[] arg)
	{
		System.out.println("Hello");	
	}

	public abstract void  m1(); //DECLARATION OF ABSTRACT METHOD

	public abstract void  m2();


}

abstract class Subtest extends AbstractImplimantation 
{
	public void m1()
	{}	

}
class subsubtest extends AbstractImplimantation
{
	public void m1()
	{}
	
	public void m2()
	{}
}

