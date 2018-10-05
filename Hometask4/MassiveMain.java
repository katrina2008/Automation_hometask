package hometask4;

public class MassiveMain {
	public static void main(String[] args) {
		int size = 10;
		double[] array = new double[size];
		for (int i = 0; i < array.length; i++)
		{
			array[i] = (int) (Math.random() * 10);
		}
		Massive massive = new Massive();
		massive.printMassiveAsLine(array);
		massive.printReverseMassiveAsLine(array);
		massive.getSumOfElements(array);
		massive.multiplyBy3(array);
	}

}
