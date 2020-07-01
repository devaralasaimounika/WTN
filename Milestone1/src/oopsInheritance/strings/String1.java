package oopsInheritance.strings;
import java.util.Scanner;
public class String1 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	String rev="";
	int len=s.length();
	for(int i=len-1;i>=0;i--)
	{
		rev+=s.charAt(i);
	}
	if(s.equals(rev))
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
}
}
