package quackable;

import java.util.ArrayList;
import java.util.Iterator;



public class flock implements quackable{
	ArrayList ducklist;
	public flock()
	{
		ducklist=new ArrayList();
	}
	
	public void add(quackable qua)
	{
		ducklist.add(qua);
	}
	
	public void quack()
	{
		Iterator it=ducklist.iterator();
		while(it.hasNext())
		{
			quackable qua=(quackable)it.next();
			qua.quack();
		}
	}
}
