package menuComponent;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class menuComponent {
	public String getName()
	{
		throw new UnsupportedOperationException();
	}
	
	public String getDescription()
	{
		throw new UnsupportedOperationException();
	}
	
	public boolean getVegaterian()
	{
		throw new UnsupportedOperationException();
	}
	
	public double getPrice()
	{
		throw new UnsupportedOperationException();
	}
	
	public void add(menuComponent component)
	{
		throw new UnsupportedOperationException();
	}
	
	public void remove(menuComponent component)
	{
		throw new UnsupportedOperationException();
	}
	
	public void print()
	{
		throw new UnsupportedOperationException();
	}
	
	public menuComponent getChild(int i)
	{
		throw new UnsupportedOperationException();
	}
	
	public Iterator createIterator()
	{
		throw new UnsupportedOperationException();
	}
	
	public ArrayList returnList()
	{
		throw new UnsupportedOperationException();
	}

}
