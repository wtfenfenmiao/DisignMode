package lunch;

import java.util.Iterator;

import menu.menu;
import menuItem.menuItem;

public class lunchMenu implements menu{
	static final int MAX_ITEMS=7;
	menuItem[] menuItems;
	int position=0;
	
	public lunchMenu()
	{
		menuItems=new menuItem[MAX_ITEMS];  //�緹������ֲ�
		addItem("Vegetarian BLT","(Fakin') Bacon with lettuce & tomato on whole wheat",true,2.99);
		addItem("BLT","Bacon with lettuce & tomato on whole wheat",false,2.99);
		addItem("Soup of the day","with a side of potato salad",false,3.29);
		addItem("Hotdog","A hot dog,with saurkraut,relish,onions,topped with cheese",false,3.05);
	}
	
	public void addItem(String name,String description,boolean vegaterian,double price)
	{
		if(position>=7)
		{
			System.err.println("���������ֲˣ�");
		}
		else
		{
			menuItem me=new menuItem(name,description,vegaterian,price);
			menuItems[position++]=me;
		}
		
	}
	
	
	public Iterator createrIterator() {
		return new lunchIterator(menuItems);
	}

}
