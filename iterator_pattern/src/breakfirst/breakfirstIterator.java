package breakfirst;

import java.util.ArrayList;
import java.util.Iterator;

public class breakfirstIterator implements Iterator{
	ArrayList menuItems;
	int position=0;
	
	public breakfirstIterator(ArrayList menuItems)
	{
		this.menuItems=menuItems;
	}
	public boolean hasNext() {
		if(position>=menuItems.size()||menuItems.get(position)==null)
			return false;
		else
			return true;
	}

	public Object next() {
		if(hasNext())
		{
			
			return menuItems.get(position++);
		}
		else
			return null;
	}

}
