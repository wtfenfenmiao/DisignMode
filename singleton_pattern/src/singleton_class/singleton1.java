//��򵥵ģ��ӳ�ʵ�����������Ƕ��߳�

package singleton_class;

public class singleton1 {
	private static singleton1 instance;
	private singleton1(){}
	public static singleton1 getInstance()
	{
		if(instance==null)
		{
			System.out.println("singleton1ʵ������");
			instance=new singleton1();
		}
		return instance;
	}
	
	public void print()
	{
		System.out.println("Hello1");
	}
}
