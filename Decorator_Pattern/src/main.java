import decorated.coffee;
import decorated.tea;
import decorator.milk;
import decorator.sugar;
import supertype.beverage;


public class main {

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