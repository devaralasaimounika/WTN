package javaFundamentals.arrays;

public class arrayex8 {
public static void main(String args[]) {
	int []arr= new int[] {10,3,6,1,2,7,9};
	int sum=0;
	int six=-1;
	int seven=-1;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==6)
			six=i;
		if(arr[i]==7)
			seven=i;
	}
	if(seven==-1)
		six=-1;
	for(int i=0;i<arr.length;i++)
	{
		if(six!=-1&&i>=six&&i<=seven)
			continue;
		sum+=arr[i];
	}
	System.out.println(sum);
	
}
}
