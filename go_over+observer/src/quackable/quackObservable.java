package quackable;

import java.util.Observer;

public interface quackObservable {
	public void addObserver(observer ob);
	public void notifyObserver();
}
