package factory;

import goose.goose;
import gooseAdapter.gooseAdapter;
import quackable.quackable;
import decorator.duckDecorator;
import duck.RubberDuck;
import duck.mallard;
import duck.woodenDuck;

public class DecoratorFactory extends abstractFactory{
	public quackable createMallard() {
		return new duckDecorator(new mallard());
	}

	@Override
	public quackable createRubberDuck() {
		return new duckDecorator(new RubberDuck());
	}

	@Override
	public quackable createwoodenDuck() {
		return new duckDecorator(new woodenDuck());
	}

	@Override
	public quackable createfakeDuck() {
		return new duckDecorator(new gooseAdapter(new goose()));
	}
}
