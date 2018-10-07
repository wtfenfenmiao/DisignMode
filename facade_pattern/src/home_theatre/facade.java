package home_theatre;

public class facade {
	home_theatre the;
	public facade(home_theatre the)
	{
		this.the=the;
	}
	
	public void conOpen()
	{
		the.open();
		the.putCD();
		the.play();
	}
	
	public void conClose()
	{
		the.close();
	}
}
