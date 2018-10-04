import waitress.waitress;
import menuComponent.menu;
import menuComponent.menuComponent;
import menuComponent.menuItem;


public class main {

	public static void main(String[] args) {
		menuComponent breakfirst=new menu("breakfirst","menu");
		menuComponent lunch=new menu("lunch","menu");
		menuComponent dinner=new menu("dinner","menu");
		menuComponent menu=new menu("MENU","total");
		menuComponent dessert=new menu("dessert","menu");
		menuComponent test=new menu("test","menu");
		
		
		
		
		breakfirst.add(new menuItem("K&B's Pancake Breakfirst","Pancakes with scrambled eggs,and toast",true,2.99));
		breakfirst.add(new menuItem("Regular Pancake Breakfirst","Pancakes with fried eggs,sausage",false,2.99));
		breakfirst.add(new menuItem("Blueberry Pancakes","Pancakes made with fresh blueberries",true,3.49));
		breakfirst.add(new menuItem("Waffles","Waffles,with your choice of blueberries or strawberries",true,3.59));
		
		lunch.add(new menuItem("Vegetarian BLT","(Fakin') Bacon with lettuce & tomato on whole wheat",true,2.99));
		lunch.add(new menuItem("BLT","Bacon with lettuce & tomato on whole wheat",false,2.99));
		lunch.add(new menuItem("Soup of the day","with a side of potato salad",false,3.29));
		lunch.add(new menuItem("Hotdog","A hot dog,with saurkraut,relish,onions,topped with cheese",false,3.05));

		dinner.add(new menuItem("Veggie Burger and Air Fries","Veggie burger on a whole wheat bun,lettuce,tomato,and fries",true,3.99));
		dinner.add(new menuItem("Soup of the day","A cup of the soup of the day,with a side salad",false,3.69));
		dinner.add(new menuItem("Burrito","A large burrito,with whole pinto beans,salsa,guacamole",true,4.29));
	
		dessert.add(new menuItem("Apple pie","Apple pie with a flakey crust,topped eith vanilla ice cream",true,1.59));
		test.add(new menuItem("test","Apple pie with a flakey crust,topped eith vanilla ice cream",true,1.59));
		
		dessert.add(test);
		lunch.add(dessert);
		
		menu.add(breakfirst);
		menu.add(lunch);
		menu.add(dinner);
		waitress Lili=new waitress(menu);
		Lili.print();
		System.out.println();
		Lili.printVeg();
	
	}

}
