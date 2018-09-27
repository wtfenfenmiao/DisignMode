package furniture;

public class fan {
	private String location;
	public final int HIGH=5;
	public final int MEDIUM=3;
	public final int LOW=1;
	public final int OFF=0;
	int speed=0;
	public fan(String location)
	{
		this.location=location;
	}
	public void high()
	{
		speed=HIGH;
		this.printSpeed();
	}
	public void medium()
	{
		speed=MEDIUM;
		this.printSpeed();
	}
	public void low()
	{
		speed=LOW;
		this.printSpeed();
	}
	public void off()
	{
		speed=OFF;
		this.printSpeed();
	}
	public void printSpeed()
	{
		System.out.println("the fan in "+location+" turn to "+speed);
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
}
