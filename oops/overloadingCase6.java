import java.util.*;
import java.lang.*;

class animal
{
 }
class monkey extends animal
{
 }

class overloadingCase6
{

  public void m1(animal a)
	{
	System.out.println("Animal Version");	
	}

 public void m1(monkey m)
	{
	System.out.println("monkey Version");	
	}

	
	public static void main(String arg[])
	{
		overloadingCase6 t = new overloadingCase6();
		
		animal a = new animal();
		t.m1(a);

		monkey m = new monkey();
		t.m1(m);
		
		animal a1 = new monkey();
		t.m1(a1);
		
		//monkey b1 = new	animal();	child can't hold the oveject of parent
		//t.m1(b1);
		
	}

}
