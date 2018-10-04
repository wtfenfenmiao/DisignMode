import dinner.caffeeMenu;
import lunch.lunchMenu;
import menu.menu;
import breakfirst.pancakeMenu;
import waitress.waitress;


public class main {

	public static void main(String[] args) {
		menu breakfirst=new pancakeMenu();
		menu lunch=new lunchMenu();
		menu dinner=new caffeeMenu();
		waitress Lili=new waitress(breakfirst,lunch);
		Lili.addMenu(dinner);
		Lili.printMenu();
	}

}
