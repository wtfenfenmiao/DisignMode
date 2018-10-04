package componentIterator;

import java.util.Iterator;

public class nullIterator implements Iterator{

	public boolean hasNext() {
		return false;
	}

	@Override
	public Object next() {
		return null;     
	}

}
