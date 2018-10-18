package hometask8;

public class ExampleTester {

	public static void main(String[] args) {
		Tester tester = new Tester ("Kate", "Terekhova");
		// tester.getBonus(); невозможно вызвать метод так как он объ€влен как private
		tester.setExpirienceInYears(5);
		tester.setEnglishLevel("Intermediate");
		tester.setSalary(5000);
		
		tester.getMonthExpirienceInYears();
		tester.nameSurname();
		tester.allInformation();
		
	}

}
