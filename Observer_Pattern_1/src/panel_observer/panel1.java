package panel_observer;

import observer.Observer;
import subject.Subject;
import display.Display;

public class panel1 implements Observer,Display{
	private int tempreture;
	private Subject sub;
	public panel1(Subject sub)
	{
		this.sub=sub;
		sub.AddObserver(this);
	}
	
	public void update(int tempreture,int humidity,int sun)
	{
		this.tempreture=tempreture;
		display();
	}
	public void display()
	{
		System.out.println("this is panel1!");
		System.out.println("the tempreture is "+tempreture);
	}
}
