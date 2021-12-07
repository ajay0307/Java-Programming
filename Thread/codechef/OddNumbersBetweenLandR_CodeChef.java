/*You're given two numbers L and R. Print all odd numbers between L and R
(both inclusive) in a single line separated by space, in ascending (increasing) order.

Input:	    First-line will contain two numbers L and R.

Output: Print all odd numbers in a single line separated by space, in ascending (increasing) order.

Constraints:  1≤L<R≤106

Sample Input 1: 2 9
Sample Output 1: 3 5 7 9

Sample Input 2: 3 4
Sample Output 2: 3
*/

class OddNumbersBetweenLandR_CodeChef


{
	public static void main(String[] args)
	{
		int l=3;
		int r=4;
		
		for(int i=l;i<=r;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);			
			}		
				
		}	
	}
}
