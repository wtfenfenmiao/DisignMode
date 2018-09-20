package panel_observer;

import observer.Observer;
import subject.Subject;
import display.Display;

public class panel3 implements Observer,Display{
	private int sun;
	private Subject sub;
	public panel3(Subject sub)
	{
		this.sub=sub;
		sub.AddObserver(this);
	}
	public void update(int tempreture,int humidity,int sun)
	{
		this.sun=sun;
		display();
	}
	public void display()
	{
		System.out.println("this is panel3!");
		System.out.println("the sun is "+sun);
	}
}