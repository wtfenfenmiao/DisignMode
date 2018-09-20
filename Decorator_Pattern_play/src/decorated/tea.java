package decorated;

import supertype.beverage;

public class tea extends beverage{
	public tea()
	{
		description="tea";
	}
	public double cost()
	{
		return 2.99;
	}
}
