//����ģʽ��һ��Сʵ�֡��Ժ���Ըĸġ��о����ģʽ���ò��ã����Ǹĵ�ʱ����Կ�������Ψһ����ľ��Ǳ䣬�š�
import quackbehavior.QuackBehavior;
import quackbehavior.silence;
import quackbehavior.zhizhi;
import duck.Duck;
import duck.RubberDuck;
import duck.mallard;


public class main {

	public static void main(String[] args) {
		Duck amall=new mallard();
		amall.swim();
		amall.display();
		amall.makesound();
		amall.flying();
		
		
		amall.changequack(new zhizhi());
		amall.makesound();
		
		Duck xiaohuang=new RubberDuck();
		xiaohuang.swim();
		xiaohuang.display();
		xiaohuang.makesound();
		xiaohuang.flying();
	}

}