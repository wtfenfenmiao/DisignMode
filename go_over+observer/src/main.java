import factory.DecoratorFactory;
import factory.abstractFactory;
import goose.goose;
import gooseAdapter.gooseAdapter;
import decorator.duckDecorator;
import duck.RubberDuck;
import duck.mallard;
import duck.woodenDuck;
import quackable.artist;
import quackable.flock;
import quackable.observer;
import quackable.quackable;


public class main {

	public static void main(String[] args) {
		/*
		quackable malla=new mallard();
		quackable rubber=new RubberDuck();
		quackable woodDuck=new woodenDuck();
		quackable fakeDuck=new gooseAdapter(new goose());
		
		quackable mallaDecorator=new duckDecorator(malla);
		quackable rubberDecorator=new duckDecorator(rubber);
		quackable woodDuckDecorator=new duckDecorator(woodDuck);
		quackable fakeDuckDecorator=new duckDecorator(fakeDuck);
		
		
		simulate(malla);
		simulate(rubber);
		simulate(woodDuck);
		simulate(fakeDuck);
		 */
		abstractFactory factory=new DecoratorFactory();
		quackable malla=factory.createMallard();
		quackable rubber=factory.createRubberDuck();
		quackable woodDuck=factory.createwoodenDuck();
		quackable fakeDuck=factory.createfakeDuck();
		observer John=new artist();
		malla.addObserver(John);
		rubber.addObserver(John);
		woodDuck.addObserver(John);
		fakeDuck.addObserver(John);
		simulate(malla);
		simulate(rubber);
		simulate(woodDuck);
		simulate(fakeDuck);
		System.out.println(duckDecorator.getCount());
		
		
		quackable malla1=new mallard();
		quackable malla2=new mallard();
		quackable malla3=new mallard();
		quackable rubber2=new RubberDuck();
		quackable woodDuck2=new woodenDuck();
		quackable fakeDuck2=new gooseAdapter(new goose());
		flock flockmall=new flock();
		flockmall.add(malla1);
		flockmall.add(malla2);
		flockmall.add(malla3);
		flock flockall=new flock();
		flockall.add(flockmall);
		flockall.add(rubber2);
		flockall.add(woodDuck2);
		flockall.add(fakeDuck2);
		
		flockall.addObserver(John);
		
		flockall.quack();
		
		
		
		

	}
	
	static public void simulate(quackable duck)
	{
		duck.quack();
	}

}
