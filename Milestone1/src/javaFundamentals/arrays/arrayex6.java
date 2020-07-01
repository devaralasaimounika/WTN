package javaFundamentals.arrays;

public class arrayex6 {
public static void main(String args[])
{
	int[] ar=new int[] {13,22,3,100,7,2};
	int temp=0;
	for(int i=0;i<ar.length;i++)
	{
		for(int j=i+1;j<ar.length;j++)
		{
			if(ar[i]>ar[j]) {
				temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
	}
	for(int i=0;i<ar.length;i++)
	{
		System.out.print(ar[i]+" ");
	}
}
}
