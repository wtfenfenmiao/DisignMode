package Observer;

import java.util.Observable;
import java.util.Observer;

import display.Display;
import Subject.weatherData;

public class panel3 implements Observer,Display{
	private Observable ob;
	private int sun;
	
	public panel3(Observable ob)
	{
		this.ob=ob;
		ob.addObserver(this);
	}
	
	public void update(Observable ob,Object arg)
	{
		if(ob instanceof weatherData)
		{
			sun=((weatherData)ob).getsun();
			display();
		}
	}

	public void display() {
		System.out.println("this is panel3!");
		System.out.println("the sun is "+sun);		
	}
}
