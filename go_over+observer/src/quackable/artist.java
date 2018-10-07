package quackable;

public class artist implements observer{

	public void update(quackObservable duck) {
		System.out.println("artist:"+duck);
		
	}

}
