//˫�ؼ�����,�ӳ�ʵ������������̣߳����һ�������
package singleton_class;

public class singleton4 {
	private volatile static singleton4 instance;
	private singleton4(){}
	public static singleton4 getInstance()
	{
		if(instance==null)
		{
			System.out.println("singleton4ʵ������");
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
