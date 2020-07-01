package oopsInheritance.strings;

public class String4 {
public static void main(String args[])
{
	String st1="TomCat";
	String st2=null;
	int length=st1.length();
	int n=length/2;
	if(length%2==0)
	{
		st2="";
		for(int i=0;i<n;i++) {
			st2=st2+st1.charAt(i);
	}
	System.out.println(st2);
}
else
	System.out.println(st2);
}
}
