import java.util.*;


  class VehicalAbstract
{
	public static void main(String[] arg)
	{
		//System.out.println("Hello");	
	
	
         bus b = new bus();
	 System.out.println(b.getnoofwheels());
	
        auto a = new auto();
	System.out.println(a.getnoofwheels());
}

}
abstract class Vehical
{
	public abstract int getnoofwheels(); //DECLARATION OF ABSTRACT METHOD
	//public abstract void  m2();

}

 class bus extends Vehical
{
	public  int getnoofwheels()
	{
		return 6;
	}	

}

 class auto extends Vehical
{
	public  int getnoofwheels()
	{
		return 3;
	}	

}
