import panel_observer.panel1;
import panel_observer.panel2;
import panel_observer.panel3;
import subject.weatherData;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		weatherData weather=new weatherData();
		panel1 p1=new panel1(weather);
		panel2 p2=new panel2(weather);
		panel3 p3=new panel3(weather);
		weather.getDatas(29, 15, 3);
		weather.getDatas(27, 14, 2);
		weather.getDatas(25, 13, 1);
		
	}

}
