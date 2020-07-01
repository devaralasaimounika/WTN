package javaFundamentals.flowControlStatements;

public class flowcontstatex13 {
public static void main(String args[])
{
	int number=0;
	int i=0;
	int temp;
	for(i=10;i<=99;i++) {
		temp=0;
	for(int j=2;j<i;j++) {
		if(i%j==0) {
			temp=1;
		break;
	}
		
	}
	if(temp==0)
		System.out.print(i);
	System.out.print(" ");
	}
}
}
		
			
	

