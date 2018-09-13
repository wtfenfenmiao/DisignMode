package duck;

import quackbehavior.Quack;
import quackbehavior.QuackBehavior;
import flybehavior.FlyBehavior;
import flybehavior.NormalFly;

public class mallard extends Duck{
	public mallard()
	{
		flyBehavior=new NormalFly();
		quackBehavior=new Quack();
	}
	
	public void display()
	{
		System.out.println("I am mallard");
	}
	
	
}
