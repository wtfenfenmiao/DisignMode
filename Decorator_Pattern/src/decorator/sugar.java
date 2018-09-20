package decorator;

import supertype.Decorator;
import supertype.beverage;

public class sugar extends Decorator{
	beverage Beverage;
	public sugar(beverage b)
	{
		this.Beverage=b;
	}
	
	public String getDescription()
	{
		return Beverage.getDescription()+",sugar";
	}
	
	public double cost()
	{
		return Beverage.cost()+0.99;
	}
}
