//最简单的，延迟实例化，不考虑多线程

package singleton_class;

public class singleton1 {
	private static singleton1 instance;
	private singleton1(){}
	public static singleton1 getInstance()
	{
		if(instance==null)
		{
			System.out.println("singleton1实例化！");
			instance=new singleton1();
		}
		return instance;
	}
	
	public void print()
	{
		System.out.println("Hello1");
	}
}
