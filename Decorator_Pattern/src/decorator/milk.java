package decorator;

import supertype.Decorator;
import supertype.beverage;

public class milk extends Decorator{
	beverage Beverage;
	public milk(beverage b)
	{
		this.Beverage=b;
	}
	
	public String getDescription()
	{
		return Beverage.getDescription()+",milk";
	}
	
	
	public double cost()
	{
		return Beverage.cost()+2.0;
	}
}
