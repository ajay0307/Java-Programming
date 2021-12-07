/*You are given a list of N integers and you need to reverse it and print the reversed list in a new line.

Input:    First-line will contain the number N.
	  Second line will contain N space-separated integers.

Output: Print the reversed list in a single line.

Constraints:  1≤N,Ai≤105

Sample Input 1: 4
		1 3 2 4
Sample Output 1:
		4 2 3 1

Sample Input 2:  2
	         9 8
Sample Output 2: 8 9
*/

import java.util.*;
import java.util.Scanner.*;
class ReaverseListNumber_CodeChef
{
	public static void  main(String[] args)
	{
		
	/*
	Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++)	{
		
		int arr[i]=sc.nexrInt;
		}	
		for(int i=0;i<n;i++)
		{
		System.out.println(arr[i]);
		}
	}*/

	Scanner sc=new Scanner(System.in);
	System.out.println("Entrer the number of elements");
	int n=sc.nextInt();
	
	int arr[] =new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();	
	}
		
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.print(" "+arr[i]);	

		
	}	
	System.out.println(" ");
	}

}
//output:= 4 2 3 1
