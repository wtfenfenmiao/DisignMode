package subject;

import java.util.ArrayList;

import observer.Observer;

public class weatherData implements Subject{
	private ArrayList observers;
	private int tempreture;
	private int humidity;
	private int sun;
	public weatherData()
	{
		observers=new ArrayList();
	}
	
	public void AddObserver(Observer o)
	{
		observers.add(o);
	}
	
	public void RemoveObserver(Observer o)
	{
		int idx=observers.indexOf(o);
		if(idx>=0)
			observers.remove(idx);
	}
	
	public void NotifyObserver()
	{
		for(int i=0;i<observers.size();++i)
		{
			Observer ob=(Observer) observers.get(i);
			ob.update(tempreture,humidity,sun);
		}
	}
	
	public void measurementChanged()
	{
		NotifyObserver();
	}
	
	public void getDatas(int tempreture,int humidity,int sun)
	{
		this.tempreture=tempreture;
		this.humidity=humidity;
		this.sun=sun;
		measurementChanged();
	}
}
