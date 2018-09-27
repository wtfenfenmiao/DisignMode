package furniture;

public class light {
	private String location;
	public light(String location)
	{
		this.location=location;
	}
	public void on()
	{
		System.out.println("The light in "+location+" is on!");
	}
	
	public void off()
	{
		System.out.println("The light in "+location+" is off!");
	}
	
}
