package hometask5;

public class TesterMain {

	public static void main(String[] args) {
		Tester tester = new Tester ();
		System.out.println (tester.getBonus(200));
		System.out.println (tester.getBonus("Kate", "Terekhova"));
		System.out.println (tester.getBonus("Kate", "Terekhova", 5));
		System.out.println (Tester.getEnglishLevel("intermediate"));
	}

}
