package countarray;

import java.util.Scanner;

public class Data 
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int []ar=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		int max=Integer.MIN_VALUE;
		int max1=Integer.MIN_VALUE;
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
			if(count>max)
			{
				max=count;
				max1=ar[i];
			}
		}
		System.out.println(max1);
	
			
	}
}
