package countarray;

import java.util.Scanner;

public class Data 
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int []ar=new int[n];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		for(int i=0;i<ar.length;i++)
		{
			int count=1;
			for(int j=1+i;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
					i++;
				}
			}
			if(count==1 && ar[i]>max)
			{
					max=ar[i];	
			}
		}
		System.out.println(max);
	
			
	}
}
