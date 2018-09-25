//双重检查加锁,延迟实例化，解决多线程，并且还有性能
package singleton_class;

public class singleton4 {
	private volatile static singleton4 instance;
	private singleton4(){}
	public static singleton4 getInstance()
	{
		if(instance==null)
		{
			System.out.println("singleton4实例化！");
			synchronized(singleton4.class)
			{
				if(instance==null)
					instance=new singleton4();
			}
		}
		return instance;
	}
	
	public void print()
	{
		System.out.println("hello4!");
	}
}
