import home_theatre.facade;
import home_theatre.home_theatre;



public class main {

	public static void main(String[] args) {
		home_theatre the=new home_theatre();
		facade controller=new facade(the);
		controller.conOpen();
		controller.conClose();
		

	}

}
