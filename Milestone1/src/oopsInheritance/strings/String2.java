package oopsInheritance.strings;

public class String2 {
public String conCat(String st1,String st2)
{
	if(st1.length() !=0 && st2.length() !=0 && st1.charAt(st1.length()-1)==st2.charAt(0))
		return st1+st2.substring(1);
	return st1+st2;
		
}	
	public static void main(String args[])
{
	String2 c=new String2();
	String st1="Mark";
	String st2="kate";
	System.out.println(c.conCat(st1,st2));
}
}
