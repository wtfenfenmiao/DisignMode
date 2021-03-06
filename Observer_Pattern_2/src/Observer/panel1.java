package Observer;

import java.util.Observable;
import java.util.Observer;

import display.Display;
import Subject.weatherData;

public class panel1 implements Observer,Display{
	private Observable ob;
	private int tempreture;
	
	public panel1(Observable ob)
	{
		this.ob=ob;
		ob.addObserver(this);
	}
	
	public void update(Observable ob,Object arg)
	{
		if(ob instanceof weatherData)
		{
			tempreture=((weatherData)ob).gettemp();
			display();
		}
	}

	public void display() {
		System.out.println("this is panel1!");
		System.out.println("the tempreture is "+tempreture);		
	}
}
