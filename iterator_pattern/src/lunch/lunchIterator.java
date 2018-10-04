package lunch;

import java.util.Iterator;

import menuItem.menuItem;

public class lunchIterator implements Iterator{
	menuItem[] menuItems;
	int position=0;

	public lunchIterator(menuItem[] menuItems)
	{
		this.menuItems=menuItems;
	}
	
	public boolean hasNext() {
		if(position>=menuItems.length||menuItems[position]==null)
			return false;
		return true;
	}


	public Object next() {
		if(hasNext())
		{
			return menuItems[position++];
		}
		else
			return null;
	}

}
