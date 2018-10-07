package factory;

import goose.goose;
import gooseAdapter.gooseAdapter;
import duck.RubberDuck;
import duck.mallard;
import duck.woodenDuck;
import quackable.quackable;

public class duckFactory extends abstractFactory{

	public quackable createMallard() {
		return new mallard();
	}

	@Override
	public quackable createRubberDuck() {
		return new RubberDuck();
	}

	@Override
	public quackable createwoodenDuck() {
		return new woodenDuck();
	}

	@Override
	public quackable createfakeDuck() {
		return new gooseAdapter(new goose());
	}

}
