package breakfirst;

import java.util.ArrayList;
import java.util.Iterator;

import menu.menu;
import menuItem.menuItem;

public class pancakeMenu implements menu{
	ArrayList menuItems;
	int position=0;
	
	public pancakeMenu()
	{
		menuItems=new ArrayList();
		addItem("K&B's Pancake Breakfirst","Pancakes with scrambled eggs,and toast",true,2.99);
		addItem("Regular Pancake Breakfirst","Pancakes with fried eggs,sausage",false,2.99);
		addItem("Blueberry Pancakes","Pancakes made with fresh blueberries",true,3.49);
		addItem("Waffles","Waffles,with your choice of blueberries or strawberries",true,3.59);
	}
	
	public void addItem(String name,String description,boolean vegaterian,double price)
	{
		menuItem me=new menuItem(name,description,vegaterian,price);
		menuItems.add(me);
	}
	

	public Iterator createrIterator() {
		// TODO Auto-generated method stub
		return new breakfirstIterator(menuItems);
		//return menuItems.iterator();
	}

}
