
package subject;

import observer.Observer;

public interface Subject {
	public void AddObserver(Observer o);
	public void RemoveObserver(Observer o);
	public void NotifyObserver();
}
