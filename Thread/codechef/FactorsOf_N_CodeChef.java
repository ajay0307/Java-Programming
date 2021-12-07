import java.util.*;
//5*4*3*2*1
/*You are given a number N and find all the distinct factors of N

.
Input:

    First-line will contain the number N

    .

Output:

    In the first line print number of distinct factors of N

    .
    In the second line print all distinct factors in ascending order separated by space.

Constraints

    1≤N≤106

Sample Input 1:

4

Sample Output 1:

3
1 2 4
*/


/*    Loop from 1 till the number.
    In every iteration divide the number whose factors need to be determined by current loop counter and check the remainder of division.
    If the remainder is zero, then the current loop counter is a factor of given number else not.*/
class FactorsOf_N_CodeChef   
{
	public static void main(String[] args)
	{
		int n=6;
		int cnt=0;
		
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				cnt++;
				
		
			}
					
		}
			
		System.out.println(cnt);	
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				
				System.out.print(i+" ");	
		
			}
					
		}
		System.out.println();
		
		
	}


}
