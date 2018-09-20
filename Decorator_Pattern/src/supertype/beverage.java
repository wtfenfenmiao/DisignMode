package supertype;


public abstract class beverage
{
	protected String description = "unknown beverage";
	public String getDescription()
	{
		return description;
	}
	
	public abstract double cost();
}