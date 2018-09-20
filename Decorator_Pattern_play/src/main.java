import supertype.beverage;
import decorated.coffee;
import decorated.tea;
import decorator.milk;
import decorator.sugar;


public class main {
    //用我自己的方式写了下，改了一点点，只是一个，不知道我的想法对不对的验证
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		beverage atea=new tea();
		System.out.println(atea.cost());
		System.out.println(atea.getDescription());
		beverage acoffee=new coffee();
		System.out.println(acoffee.cost());
		System.out.println(acoffee.getDescription());
		beverage complex=new coffee();
		complex=new milk(complex);
		System.out.println(complex.cost());
		System.out.println(complex.getDescription());
		complex=new sugar(complex);
		System.out.println(complex.cost());
		System.out.println(complex.getDescription());
	}

}
