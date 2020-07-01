package oopsInheritance.classesAndObjects;


public class Box {
double height,width,depth;
Box()
{
	height=1;
	depth=1;
	width=1;
}
Box(double width,double height,double depth){
	this.width=width;
	this.height=height;
	this.depth=depth;
}
double vol()
{
	return width*height*depth;
}
public static void main(String args[])
{
	Box bx1=new Box(10,20,30);
	System.out.println(bx1.vol());
}
}
