
import java.io.*;
import java.util.Arrays;
                  
class Demo {

public static void main(String[] args) throws Exception
	{
	String str = "Ajay";
	
	char arr[] = str.toCharArray();

	char temp;

	for (int i=0;i<arr.length;i++) 
	{
	//int k = i + 1;
	for (int j=i+1;j < arr.length;j++) 
	{
		if (arr[j]<arr[i])
		 {

		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
				
	}
			
	}

		System.out.println(arr);
	String str1="jaAy";
	
	char arr1[] = str.toCharArray();
	
	char temp1;
	
	for(int l=0;l<arr1.length;l++)
	{
		for(int m=l+1;m<arr1.length;m++)
		{
			if(arr1[m]<arr1[l])
			{
				temp1=arr1[l];
				arr1[l]=arr1[m];
				arr1[m]=temp1;
			}
		
		}
	}
	System.out.println(arr1);
	boolean res = Arrays.equals(arr,arr1);
	
	if(res==true)
	{
		System.out.println("Anagram");
	}
	else
	{
		System.out.println("Not Anagram");
	}		
		
	}
}

