//�ӳ�ʵ��������synchronized�ؼ��ֽ�����߳����⣬���ܺܵ�
package singleton_class;

public class singleton2 {
	private static singleton2 instance;
	private singleton2(){}
	public synchronized static singleton2 getInstance()
	{
		if(instance==null)
		{
			System.out.println("singleton2ʵ������");
			instance=new singleton2();
		}
		return instance;
	}
	
	public void print()
	{
		System.out.println("hello2!");
	}
	
	
}
