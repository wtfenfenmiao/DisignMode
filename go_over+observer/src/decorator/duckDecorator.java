package decorator;

import quackable.observer;
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

	@Override
	public void addObserver(observer ob) {
		qua.addObserver(ob);
		
	}

	@Override
	public void noticeObserver() {
		qua.noticeObserver();
		
	}

}
