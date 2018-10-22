package hometask9;

public class Planet extends StarSystem {
	public double size;
	public double numberOfYears;

	Planet() {

	};

	Planet(double size) {
		this.size = size;
	}

	Planet(double size, double numberOfYears) {
		this(size);
		this.numberOfYears = numberOfYears;
	}

	public void PlanetSize() {

		System.out.println(size);
	}

	public void PlanetNumberOfYears() {

		System.out.println(numberOfYears);
	}

	void printAllInformation() {

		System.out.println(size + " " + numberOfYears);
	}

}
