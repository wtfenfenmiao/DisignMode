package gooseAdapter;

import goose.goose;
import quackable.quackable;

public class gooseAdapter implements quackable{
	goose goo;
	public gooseAdapter(goose goo)
	{
		this.goo=goo;
	}
	public void quack() {
		goo.gugu();
		
	}
	

}
