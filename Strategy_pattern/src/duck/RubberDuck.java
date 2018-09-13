package duck;

import quackbehavior.silence;
import flybehavior.CannotFly;

public class RubberDuck extends Duck{
	public RubberDuck()
	{
		flyBehavior=new CannotFly();
		quackBehavior=new silence();
	}
	
	public void display()
	{
		System.out.println("I am RubberDuck!");
	}
	

}
