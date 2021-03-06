package menuComponent;

import java.util.Iterator;

import componentIterator.nullIterator;

public class menuItem extends menuComponent{
	String name;
	String description;
	boolean vegaterian;
	double price;
	
	public menuItem(String name,String description,boolean vegaterian,double price)
	{
		this.name=name;
		this.description=description;
		this.vegaterian=vegaterian;
		this.price=price;
	}
	public String getName()
	{
		return name;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public boolean getVegaterian()
	{
		return vegaterian;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void print()
	{
		System.out.print(" "+getName()+",");
		System.out.print(getDescription()+",");
		System.out.print(getVegaterian()+",");
		System.out.println(getPrice());		
	}
	
	public Iterator createIterator()
	{
		return new nullIterator();
	}
}
