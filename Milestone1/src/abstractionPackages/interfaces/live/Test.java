package abstractionPackages.interfaces.live;

import abstractionPackages.interfaces.music.*;
import abstractionPackages.interfaces.music.string.*;
import abstractionPackages.interfaces.music.wind.*;


public class Test {
public static void main(String args[])
{
	Playable pv=new Veena();
	pv.play();
	Playable ps=new Saxophone();
	ps.play();
}
}
