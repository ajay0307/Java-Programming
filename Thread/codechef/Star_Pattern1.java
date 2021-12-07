/*You're given a number N. Print the first N lines of the below-given pattern.

    *
   **
  ***
 ****
*****

Input: First-line will contain the number N.
Output: Print the first N lines of the given pattern.

Constraints: 1≤N≤200

Sample Input 1:4 
Sample Output 1:
   *
  **
 ***
****

Sample Input 2: 2
Sample Output 2:
 *
**

*/



class  Star_Pattern1
{
public static void main(String[] args)
{
	int n=5;
	
	for(int i=0;i<n;i++)
	{
		
		for(int j=n;j>i;j--)
		{
			System.out.print(" ");				
		}
		
		for(int k=0;k<=i;k++)
		{
			System.out.print("*");		
		 
		}	

		System.out.println("");
	}
	
}
}
