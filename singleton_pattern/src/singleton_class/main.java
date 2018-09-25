package singleton_class;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singleton1 s1_1=singleton1.getInstance();
		s1_1.print();
		singleton1 s1_2=singleton1.getInstance();
		s1_2.print();
		singleton2 s2_1=singleton2.getInstance();
		s2_1.print();
		singleton2 s2_2=singleton2.getInstance();
		s2_2.print();
		singleton3 s3_1=singleton3.getInstance();
		s3_1.print();
		singleton3 s3_2=singleton3.getInstance();
		s3_2.print();
		singleton4 s4_1=singleton4.getInstance();
		s4_1.print();
		singleton4 s4_2=singleton4.getInstance();
		s4_2.print();
	}

}
