package duck;
import quackbehavior.QuackBehavior;
import flybehavior.FlyBehavior;


public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	 public void swim()
	 {
		 System.out.println("I am swiming!");
	 }
	 public abstract void display();
	 
	 public void makesound()
	 {
		 quackBehavior.quack();
	 }
	 
	 public void flying()
	 {
		 flyBehavior.fly();
	 }
	 
	 public void changefly(FlyBehavior fb)
	{
		flyBehavior=fb;
	}
		
	public void changequack(QuackBehavior qb)
	{
		quackBehavior=qb;
	}
}
