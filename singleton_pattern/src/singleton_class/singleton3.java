//“急切”实例化解决多线程问题，性能得到保证。但由于是急切实例化，资源敏感对象可能不适用
package singleton_class;

public class singleton3 {
	private static singleton3 instance=new singleton3();
	private singleton3(){}
	public static singleton3 getInstance()
	{
		return instance;
	}
	public void print()
	{
		System.out.println("hello3!");
	}
}
