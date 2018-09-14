import Observer.panel1;
import Observer.panel2;
import Observer.panel3;
import Subject.weatherData;


public class main {

	public static void main(String[] args) {
		weatherData wea=new weatherData();
		panel1 p1=new panel1(wea);
		panel2 p2=new panel2(wea);
		panel3 p3=new panel3(wea);
		wea.getData(30, 10, 6);
		wea.getData(29, 9, 5);
		wea.getData(28, 8, 4);
	}

}
