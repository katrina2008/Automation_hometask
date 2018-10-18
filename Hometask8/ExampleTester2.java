package hometask8_1;

import hometask8.Tester;

public class ExampleTester2 {

	public static void main(String[] args) {
		Tester tester = new Tester ("Kate", "Terekhova");
		//tester.getBonus(); //невозможно вызвать метод так как он объ€влен как private
		//tester.getMonthExpirienceInYears(); невозможно вызвать метод так как он объ€влен как default
		//tester.nameSurname(); невозможно вызвать метод так как он объ€влен как private protected
		tester.allInformation();

	}

}
