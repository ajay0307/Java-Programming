/*Given three distinct integers A, B and C, print the second largest number among them.
Input:

    The input consists of three lines.
The first line contains a single integer A.
The second line contains a single integer B.
The third line contains a single integer C.

Output:
Print the second largest number among A, B and C, in a separate line.

Constraints
    1≤A,B,C≤109

Sample Input 1: 2 7 21

Sample Output 1: 7

Sample Input 2: 14 28 16
*/

import java.util.*;

class LongestNumber_CodeChef
{
	public static void main(String[] args)
	{
		int f=2;
		int s=7;
		int t=21;
		
		if(f>s && f<t)
		{
			System.out.println(f);	
		}
		else if(s>f && s<t)
		{
			System.out.println(s);			
		}
		else if(t>f && t<s)
		{
			System.out.println(t);
		}
	}


}

//output:= 7
