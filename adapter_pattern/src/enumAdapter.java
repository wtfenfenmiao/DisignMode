import java.util.Enumeration;
import java.util.Iterator;


public class enumAdapter implements Iterator{
	Enumeration en;
	
	public enumAdapter(Enumeration en)
	{
		this.en=en;
	}
	
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return en.hasMoreElements();
	}


	public Object next() {
		// TODO Auto-generated method stub
		return en.nextElement();
	}

}
