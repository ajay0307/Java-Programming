/*You are given a list of N integers and a value K. Print 1 if K exists in the given list of N integers, otherwise print −1.

Input:    First-line will contain two numbers N and K.
          Next line contains N space-separated numbers.
Output:   Print the answer in a new line.

Constraints:  1≤N,K,Ai≤105

Sample Input 1: 4 2
		1 2 3 4
Sample Output 1: 1


Sample Input 2: 4 4
		1 2 6 9
Sample Output 2: -1
*/
import java.util.*;
import java.util.Scanner.*;

class FindNumber_CodeChef
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		boolean x=false;
		System.out.println("Enter the no which you want to find");
		int k=sc.nextInt();

		System.out.println("Enter the no of elements which you want to print");
		int n=sc.nextInt();
		
		

		int[] arr = new int[n];
		System.out.println("enter the array of elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();	
		}
			for(int i=0;i<n;i++)
		{
			
			if(arr[i]==k)
			{n
				x=true;
				break;
			}
			
	

			
			
		}	
			if(x)
			{
				System.out.println("1");
				
			}
			else
			{
				System.out.println("-1");		
			}
			
	}

}
