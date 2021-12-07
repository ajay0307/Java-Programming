import java.util.*;

class NumberFormatException //IllegarArgumentException error
{
	
public static void main(String[] args)
{
	int i=Integer.parseInt("10");
	System.out.println(i);	
	
	int j=Integer.parseInt("TEN");//Number Formaat Exception generated
	System.out.println(j);	
}

}

