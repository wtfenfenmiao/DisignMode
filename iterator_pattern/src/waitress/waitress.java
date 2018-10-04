package waitress;

import java.util.ArrayList;


import java.util.Iterator;

import menu.menu;
import menuItem.menuItem;

public class waitress {
	ArrayList menuList;
	
	public waitress(menu breakfirst,menu lunch)
	{
		menuList=new ArrayList();
		menuList.add(breakfirst);
		menuList.add(lunch);
	}
	
	public void addMenu(menu me)
	{
		menuList.add(me);
	}
	
	public void printMenu()
	{
		for(Object me:menuList)
		{
			System.out.println();
			Iterator it=((menu)me).createrIterator();
			printIterator(it);
			System.out.println();
		}
	}
	
	public void printIterator(Iterator it)
	{
		while(it.hasNext())
		{
			menuItem me=(menuItem)it.next();
			System.out.println(me.getName());
			System.out.println(me.getDescription());
			System.out.println(me.getVegaterian());
			System.out.println(me.getPrice());
			
			
		}
	}
	

}
