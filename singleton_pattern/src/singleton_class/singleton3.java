//�����С�ʵ����������߳����⣬���ܵõ���֤���������Ǽ���ʵ��������Դ���ж�����ܲ�����
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
