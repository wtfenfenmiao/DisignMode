package Subject;

import java.util.Observable;

public class weatherData extends Observable{
	private int tempreture;
	private int humidity;
	private int sun;
	
	
	public void dataChanged()
	{
		setChanged();
		notifyObservers();   //这里是空的就是“拉”
		
		//notifyObservers(tempreture);  
		//这样子带参数就是推。参数可以是任意object（我觉得可以把所有的数据封装成一个object，然后推出去；每个观察者自己取用，这样子用推）
	}
	
	public void getData(int tempreture,int humidity,int sun)
	{
		this.tempreture=tempreture;
		this.humidity=humidity;
		this.sun=sun;
		dataChanged();
	}
	
	public int gettemp()
	{
		return tempreture;
	}
	
	public int gethum()
	{
		return humidity;
	}
	
	public int getsun()
	{
		return sun;
	}

}
