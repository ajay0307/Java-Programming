/* 
 You're given the length of three sides a, b, and c respectively. Now check if these three sides can form a triangle or not. Print "YES"(without quotes) if it can form a valid triangle with an area greater than 0 , otherwise print "NO" (without quotes).

Input:    First-line will contain three numbers a, b, and c separated by space.
Output: Print "YES"(without quotes) if these sides can form a valid triangle, otherwise print "NO" (without quotes).

Constraint: 1≤a,b,c≤106

Sample Input 1: 2 4 3
Sample Output 1: YES

Sample Input 2: 1 1 4
Sample Output 2: NO


//logic of tringle
a+b=c
a+c=b
c+b=a

*/




class Tringel_CodeChef
{
	public static void main(String[] args)
	{
		int a=1;
		int b=1;
		int c=4;
	
		if(((a+b)<=c) || ((a+c)<=b) || ((c+b)<=a) )
		{
			System.out.println("its not a tringle");
		}
		else
		{
			System.out.println("its a tringle");	
		}
				
	}


}
