package panel_observer;

import observer.Observer;
import subject.Subject;
import display.Display;

public class panel2 implements Observer,Display{
	private int humidity;
	private Subject sub;
	public panel2(Subject sub)
	{
		this.sub=sub;
		sub.AddObserver(this);
	}
	public void update(int tempreture,int humidity,int sun)
	{
		this.humidity=humidity;
		display();
	}
	public void display()
	{
		System.out.println("this is panel2!");
		System.out.println("the humidity is "+humidity);
	}
}