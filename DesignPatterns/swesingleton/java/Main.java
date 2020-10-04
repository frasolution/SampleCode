package swesingleton;

public class Main {

	public static void main( String[] args ) {
		
		Singleton one = Singleton.getInstance();
		Singleton two = Singleton.getInstance();
		one.setCallA(1);
		two.setCallB(1);
		System.out.println(one.total());

	}

}
