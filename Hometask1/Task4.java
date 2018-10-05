
public class Task4 {
	public static void main(String[] args) {
		int varInt = 214748;
		short varShort = 32;
		long varLong = 9223372L;
		double varDouble = 1.797693;
		float varFloat = 3.4028f;
		char varChar = 'a';
		boolean varBool = true;

		long result1 = varInt + varShort;
		double result2 = varLong - varDouble;
		double result3 = varFloat * varDouble;
		boolean result4 = varLong > varDouble;
		boolean result5 = varFloat < varInt;
		boolean result6 = varInt == varChar;
		boolean result7 = varShort != varLong;

		System.out.println("varInt = " + varInt);
		System.out.println("varShort = " + varShort);
		System.out.println("varLong = " + varLong);
		System.out.println("varDouble = " + varDouble);
		System.out.println("varFloat = " + varFloat);
		System.out.println("varChar = " + varChar);
		System.out.println("varBool = " + varBool);
				
		System.out.println("result1 = " + result1 + '\n'
				+ "result2 = " + result2 + '\n' 
				+ "result3 = " + result3 + '\n'
				+ "result4 = " + result4 + '\n'
				+ "result5 = " + result5 + '\n' 
				+ "result6 = " + result6 + '\n'
				+ "result7 = " + result7);
	}

}
