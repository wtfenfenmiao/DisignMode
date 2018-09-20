package decorator;

import supertype.beverage;
import supertype.decorator;

public class sugar extends decorator{
	public sugar(beverage b)
	{
		ber=b;
		description=ber.getDescription()+",sugar";
	}
	public double cost()
	{
		return ber.cost()+1.5;
	}
}
