/*You're given a number N. If N is divisible by 5 or 11 but not both then print "ONE"(without quotes). If N is divisible by both 5 and 11 then print "BOTH"(without quotes). If N is not divisible by 5 or 11 then print "NONE"(without quotes).*/
import java.util.*;
class DivedeFiveOrElevan_CodeChef
{
public static void main(String[] arg)
{
	int n=16;


	
	
	
	//for(int i=0;n/5&& n/11;i++)

		
		if((n%5==0) && (n%11==0))
		{ 
			System.out.println("both");
		}		
 		else if((n%5==0) || (n%11==0))
		{
			System.out.println("One");	
		}
		else
		{
			System.out.println("None");			
		}

			
}
}
