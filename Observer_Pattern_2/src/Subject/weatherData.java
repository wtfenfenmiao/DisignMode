package Subject;

import java.util.Observable;

public class weatherData extends Observable{
	private int tempreture;
	private int humidity;
	private int sun;
	
	
	public void dataChanged()
	{
		setChanged();    //�������Ҫ�ӵġ����Կ��Ƹı��Ƶ�ʵȵȡ��������subject�����ݱ��ˣ�Ҳ������ȥ
		notifyObservers();   //�����ǿյľ��ǡ�����
		
		//notifyObservers(tempreture);  
		//�����Ӵ����������ơ���������������object���Ҿ��ÿ��԰����е����ݷ�װ��һ��object��Ȼ���Ƴ�ȥ��ÿ���۲����Լ�ȡ�ã����������ƣ�
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