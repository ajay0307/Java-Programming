import java.util.*;

class IllegalStateException //IllegalStateException error
{
	
public static void main(String[] args)
	{
		Thread t = new Thread();
		
		t.start();
		t.start();//IllgalStateException Occured


	

	}

}

