package javaFundamentals.flowControlStatements;

public class flowcontstatex7 {
	public static void main(String args[])
	{
		char c=args[0].charAt(0);
		if(c>='a'&&c<='z')
			System.out.println(args[0].toUpperCase());
		else
			System.out.println(args[0].toLowerCase());
		
	}
       
}
