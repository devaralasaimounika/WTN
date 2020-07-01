package javaFundamentals.flowControlStatements;

public class flowcontstatex12 {
public static void main(String args[])
{
	int number=Integer.parseInt(args[0]);
	int counter=0;
	for(int i=1;i<=number;i++)
	{
		if(number%i==0)
			counter++;
	}
	if(counter==2)
		System.out.println("prime");
	else
		System.out.println("not prime");
}
}
