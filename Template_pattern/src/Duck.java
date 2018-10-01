
public class Duck implements Comparable{
	String name;
	int size;
	public Duck(String name,int size)
	{
		this.name=name;
		this.size=size;
	}
	
//	public String toString()
//	{
//		StringBuffer str=new StringBuffer();
//		str.append(name+" "+size);
//		return str.toString();
//	}
	
	public String toString()
	{
		return name+" "+size;
	}


	public int compareTo(Object o) {
		Duck otherDuck=(Duck)o;
		if(this.size<otherDuck.size)
			return -1;
		else if(this.size>otherDuck.size)
			return 1;
		else
			return 0;
	}
	
}
