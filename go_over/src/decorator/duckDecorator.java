package decorator;

import quackable.quackable;

public class duckDecorator implements quackable{
	quackable qua;
	static int count=0;
	public duckDecorator(quackable qua)
	{
		this.qua=qua;
	}
	
	public void quack()
	{
		qua.quack();
		++count;
	}
	
	static public int getCount()
	{
		return count;
	}

}
