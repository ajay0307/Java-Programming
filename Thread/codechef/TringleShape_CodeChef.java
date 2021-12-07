/*You're given the three angles a, b, and c respectively. Now check if these three angles can form a valid triangle with an area greater than 0 or not. Print "YES"(without quotes) if it can form a valid triangle with an area greater than 0 , otherwise print "NO" (without quotes).

Input: First-line will contain three numbers a , b, and c separated by space.
Output: Print "YES"(without quotes) if these sides can form a valid triangle, otherwise print "NO" (without quotes).

Constraints 0≤a,b,c≤180

Sample Input 1: 20 40 120
Sample Output 1: YES

Sample Input 2: 100 18 42
Sample Output 2: NO
*/

/*
	a+b=c
	b+c=a
	a+c=b	
*/

class TringleShape_CodeChef
{
	public static void main(String[] args)
	{
		int a=100;
		int b=18;
		int c=42;
		
		if(a!=0 && b!=0 && c!=0 && (a+b+c)==180)
		{
		  if(a+b>=c||b+c>=a||a+c>=b)
			{
				System.out.println("YES");
			}
		  else
			{
				System.out.println("NO");			
			}
		}
		else
		{
				System.out.println("NO");		
		}
	}


}
