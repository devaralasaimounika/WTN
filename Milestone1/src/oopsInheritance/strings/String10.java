package oopsInheritance.strings;

public class String10 {
public static void main(String args[])
{
	String a,c="";
	int b,length;
	b=Integer.parseInt(args[1]);
	length=args[0].length();
	a=args[0];
	length=length-b;
	for(int i=0;i<b;i++)
	{
		c=c+a.substring(length);
	}
	System.out.println(c);
}
}
