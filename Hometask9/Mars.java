package hometask9;

public class Mars extends Planet {
	public double distanceFromSun;
	public double atmospherePressure;

	Mars() {

	};

	Mars(double distanceFromSun) {
		this.distanceFromSun = distanceFromSun;
	}
	
	Mars(double distanceFromSun, double atmospherePressure ) {
		this.distanceFromSun = distanceFromSun;
		this.atmospherePressure = atmospherePressure;
	}

	public void printDistanceFromSun() {
		System.out.println(distanceFromSun);
	}

	public void printAtmospherePressure() {
		System.out.println(atmospherePressure);
	}

}
