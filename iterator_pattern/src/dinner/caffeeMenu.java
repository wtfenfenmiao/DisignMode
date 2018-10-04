package dinner;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

import menu.menu;
import menuItem.menuItem;

public class caffeeMenu implements menu{
	HashMap menuItems;
	
	public caffeeMenu()
	{
		menuItems=new HashMap();
		addItem("Veggie Burger and Air Fries","Veggie burger on a whole wheat bun,lettuce,tomato,and fries",true,3.99);
		addItem("Soup of the day","A cup of the soup of the day,with a side salad",false,3.69);
		addItem("Burrito","A large burrito,with whole pinto beans,salsa,guacamole",true,4.29);
	}
	
	public void addItem(String name,String description,boolean vegaterian,double price)
	{
		menuItem me=new menuItem(name,description,vegaterian,price);
		menuItems.put(name,me);
	}
	
	
	

	public Iterator createrIterator() {
		// TODO Auto-generated method stub
		return menuItems.values().iterator();
	}

}
