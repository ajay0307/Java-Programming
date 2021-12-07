/*You're given the length of three sides a, b, and c respectively. Now If these three sides can form an Equilateral Triangle then print 1, if these three sides can form an Isosceles Triangle then print 2, if these three sides can form a Scalene Triangle then print 3, otherwise print−1.

Input: First-line will contain three numbers a , b, and c separated by space.
Output: Print the answer in a new line.

Constraints: 1≤a,b,c≤103

Sample Input 1: 2 4 3
Sample Output 1: 3

Sample Input 2: 4 4 4
Sample Output 2: 1

Sample Input 3: 4 4 9
Sample Output 3: -1

EXPLANATION:
    In the first example, (2, 4, 3) will form a Scalene Triangle.
    In the second example, (4, 4, 4) will form an Equilateral Triangle.
    In the third example, (4, 4, 9) will not form a triangle.
*//*
	a!=b||a!=c||b!=a||b!=c||c!=a||c!=b
	a!=b||c!=a||b!=c

	a+b=c
	a+c=b
	b+a=c	
*/


class Demo14
{
	public static void  main(String[] arg)
	{
		int a=4;
		int b=4;
		int c=9;
	
		if(a!=b && c!=a && b!=c)
		{
			if(a>b||a>c)
			{
				System.out.println(a);
			}
			else if(b>a||b>c)
			{
				System.out.println(b);
			}
			else
			{
				System.out.println(c);			
			}
		}
		else if((a==b)&&(c==a)&&(b==c))
		{
			System.out.println("1");
		}
		else //if((a==b)!c||(a==c)!b||(b==a)!c)
		{	
			System.out.println("-1");	
		}
	}

}
