import java.util.*;

class Fibbonanci
{
public static void main(String[] arg)
{
	int temp=0,fib1=0,fib2=1;
	for(int i=1;i<=5;i++)
	{
		temp=fib1+fib2;
		fib1=fib2;
		fib2=temp;
		System.out.println(temp);
	}
	
	
}

}
