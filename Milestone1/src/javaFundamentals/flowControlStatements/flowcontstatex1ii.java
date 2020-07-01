package javaFundamentals.flowControlStatements;

public class flowcontstatex1ii {
public static void main(String args[])
{
	int m= Integer.parseInt(args[0]);
	int n= Integer.parseInt(args[1]);
	if((m%10)==(n%10))
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
}
}
