package hometask9;

public class Example {

	public static void main(String[] args) {
		Planet planet = new Planet ();
		Planet planet1 = new Planet (366);
		Planet planet2 = new Planet (125, 569);
		
		planet2.printAllInformation();
		
		Star star = new Star ();
		star.setLuminosity(236);
		star.setRadius(556.7);
		
		Mars mars = new Mars (8966, 8669);
		
		star.printAllInformation();
		

	}

}
