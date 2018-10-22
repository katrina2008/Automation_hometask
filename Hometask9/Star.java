package hometask9;

public class Star extends StarSystem {
	
	public double radius;
	public double luminosity;
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getLuminosity() {
		return luminosity;
	}

	public void setLuminosity(double luminosity) {
		this.luminosity = luminosity;
	}

	
	public void printRadius () {
		System.out.println(radius);
	}

	public void printLuminosity () {
		System.out.println(luminosity);
	}
	
	
	void printAllInformation () {
		
		System.out.println(radius + " " + luminosity);
	}
}
