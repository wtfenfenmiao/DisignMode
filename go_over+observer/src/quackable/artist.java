package quackable;

public class artist implements observer{

	@Override
	public void update(quackObservable obs) {
		System.out.println("artist:"+obs);
		
	}

}
