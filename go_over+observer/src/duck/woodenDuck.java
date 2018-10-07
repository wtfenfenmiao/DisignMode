package duck;

import java.util.Observer;

import quackable.observable;
import quackable.observer;
import quackable.quackable;

public class woodenDuck implements quackable{
	observable obs;
	public woodenDuck()
	{
		obs=new observable(this);
	}
	
	public void quack() {
		System.out.println("bang");	
		notifyObserver();
	}
	
	@Override
	public void addObserver(observer ob) {
		obs.addObserver(ob);
		
	}

	@Override
	public void notifyObserver() {
		obs.notifyObserver();
		
	}
}
