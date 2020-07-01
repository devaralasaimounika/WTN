package javaFundamentals.arrays;

public class arrayex1 {
	public static void main(String args[])
	{
       int ar[]=new int[] {1,2,3,4,5};
       int sum=0;
       float avg=0.0f;
       for(int ele:ar)
       
    	   sum=sum+ele;
    	   avg=(float)sum/ar.length;
    	   System.out.println(sum+" "+avg);

}
}
