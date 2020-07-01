package oopsInheritance.strings;

public class String6 {
public static void main(String args[])
{
	String a,b,c;
	a="hi";
	b="hello";
	int length_a,length_b;
	length_b=b.length();
	length_a=a.length();
	if(length_a>length_b)
	{
		c=b+a+b;
	}
	else
		c=a+b+a;
	System.out.println(c);
}
}
