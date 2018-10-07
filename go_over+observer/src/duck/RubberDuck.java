package duck;

import quackable.observable;
import quackable.observer;
import quackable.quackable;

public class RubberDuck implements quackable{
	observable obs;
	public RubberDuck()
	{
		obs=new observable(this);
	}

	public void quack() {
		System.out.println("rubber");	
		noticeObserver();
	}
	
	@Override
	public void addObserver(observer ob) {
		obs.addObserver(ob);
		
	}

	@Override
	public void noticeObserver() {
		obs.noticeObserver();
	}
}
