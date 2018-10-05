package hometask4;

public class Massive {

	public void printMassiveAsLine(double[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");

		System.out.println();
	}

	public void printReverseMassiveAsLine(double[] array) {

		for (int i = array.length - 1; i >= 0; i--)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	public double getSumOfElements(double[] array) {

		double result = 0;
		for (int i = 0; i < array.length; i++)
			result = array[i] + result;
		System.out.println(result);
		return result;
	}

	public double[] multiplyBy3(double[] array) {

		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * 3;
			System.out.print(array[i] + " ");
		}

		System.out.println();
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}

		return array;

	}
}
