package Observer;

import java.util.Observable;
import java.util.Observer;

import display.Display;
import Subject.weatherData;

public class panel2 implements Observer,Display{
	private Observable ob;
	private int humidity;
	
	public panel2(Observable ob)
	{
		this.ob=ob;
		ob.addObserver(this);
	}
	
	public void update(Observable ob,Object arg)
	{
		if(ob instanceof weatherData)
		{
			humidity=((weatherData)ob).gethum();
			display();
		}
	}

	public void display() {
		System.out.println("this is panel2!");
		System.out.println("the humidity is "+humidity);		
	}
}
