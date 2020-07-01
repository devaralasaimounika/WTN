package oopsInheritance.strings;

public class String3 {
public static void main(String args[])
{
	String str="Wipro";
	String st1="";
	int length=str.length();
	if(length<=1)
	{
		st1=str;
	}
	else
	{
		for(int i=0;i<length;i++) {
			st1=st1+str.charAt(0)+str.charAt(1);
		}
	}
	System.out.print(st1);
}
}
