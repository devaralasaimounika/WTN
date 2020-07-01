package javaFundamentals.arrays;

public class arrayex14 {
public static void main(String args[])
{
	int n=args.length;
	int a[][]=new int[9][9];
	int i,j;
	int max=a[0][0];
	if(n<9)

{
    System.out.println("Please enter the 9 elements");		
}
	if(n==9)
	{
		int k=0;
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				a[i][j]=Integer.parseInt(args[k]);
				k++;
			}
		}
		System.out.println("The given array is:\n");
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if(a[i][j]>max)
					max=a[i][j];
			}
		}
		System.out.print(max);
	}
}
}
