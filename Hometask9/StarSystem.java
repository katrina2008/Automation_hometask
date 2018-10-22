package hometask9;

public abstract class StarSystem {

	public int planet;
	public int star;
	
	public void planetnumber () {
		System.out.println(planet);
	}
	
	public void starnumber () {
		System.out.println(star);
	}
	
	abstract void printAllInformation ();
	
	
	
}
