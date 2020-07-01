package javaFundamentals.flowControlStatements;

public class flowcontstatex14 {
public static void main(String args[])
{
	int number=Integer.parseInt(args[0]);
	int rem,val=0;
	while(number!=0) {
		rem=number%10;
		val=val+rem;
		number=number/10;
	}
	System.out.println(val);
}
}
