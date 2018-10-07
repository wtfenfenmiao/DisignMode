package adapter;

import client.duck;
import exist.goose;

public class gooseToDuckAdapter implements duck{
	goose goo;
    
	public gooseToDuckAdapter(goose goo)
	{
		this.goo=goo;
	}
	public void quack() {
		goo.gugu();
	}
	
	public void fly()
	{
		for(int i=0;i<5;++i)
		{
			goo.fly();
		}
	}

}
