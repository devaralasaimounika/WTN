package javaFundamentals.arrays;

public class arrayex9 {
public static void main(String args[])
{
	int []a=new int[] {1,10,3};
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==10)
		{
			a[i]=0;
			for(int j=1;j<a.length-1;j++)
			{
				a[j]=a[j]+a[j+1];
				a[j+1]=a[j]-a[j+1];
				a[j]=a[j]-a[j+1];
			}
		}
	}
		for(int i=0;i<a.length;i++)
			System.out.print(" "+a[i]);
	
}
}
