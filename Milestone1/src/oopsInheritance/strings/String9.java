package oopsInheritance.strings;

public class String9 {
public static void main(String args[])
{
	String st1="Hello";
	String st2="World";
	String st="";
	int st1length,st2length,length,i=0;
	st1length=st1.length();
	st2length=st2.length();
	length=(st1length+st2length);
	length=Math.min(st1length,st2length);
	while(i<length)
	{
		st=st+st1.charAt(i)+st2.charAt(i);
		i++;
	}
	if(length==st1length) {
		if(st1length!=st2length)
		st=st+st2.substring(length-1);
		
	}
	else
		st=st+st1.substring(length-1);
	System.out.println(st);

}
}
