package decorator;

import supertype.beverage;
import supertype.decorator;

public class milk extends decorator{
	
	public milk(beverage b)
	{
		ber=b;
		description=ber.getDescription()+",milk";
	}
	public double cost()
	{
		return ber.cost()+1.0;
	}
	

}