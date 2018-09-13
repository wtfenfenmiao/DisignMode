//策略模式的一个小实现。以后可以改改。感觉设计模式看好不好，就是改的时候可以看出来。唯一不变的就是变，嗯。
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
