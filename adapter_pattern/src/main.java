import adapter.gooseToDuckAdapter;
import client.duck;
import client.mallard;
import exist.Domestic_goose;
import exist.goose;


public class main {

	public static void main(String[] args) {
		duck BobDuck=new mallard();
		goose LiliGoose=new Domestic_goose();
		BobDuck.quack();
		BobDuck.fly();
		System.out.println();
		LiliGoose.gugu();
		LiliGoose.fly();
		System.out.println();
		duck fakeDuck=new gooseToDuckAdapter(new Domestic_goose());
		testDuck(BobDuck);
		testDuck(fakeDuck);

	}
	
	public static void testDuck(duck du)
	{
		du.quack();
		du.fly();
		System.out.println();
	}

}
