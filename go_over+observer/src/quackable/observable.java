package quackable;

import java.util.ArrayList;

public class observable implements quackObservable{

	ArrayList observers;
	quackObservable duck;
	
	public observable(quackObservable duck)
	{
		this.duck=duck;
		observers=new ArrayList();
	}

	public void addObserver(observer ob) {
		observers.add(ob);
		
	}


	public void noticeObserver() {
		for(Object ob:observers)
		{
			((observer)ob).update(duck);
		}
		
	}
	

}
