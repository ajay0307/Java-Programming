import java.util.*;
	
class ThreadInterrupte{
  public static void main(String[] arg) 
	{
		double[] n = new double[]{44.76,-67,87.5,0,12,86.89,90};
		double total = 7;
		double sum = 0;
		for(int i=0;i<n.length;i++){
			sum = sum+n[i];
		}
		double avg = sum/total;

		double c = ((avg-32)*5)/9;
		//c = c/5;

		System.out.printf("%.2f",c);
	}


}
