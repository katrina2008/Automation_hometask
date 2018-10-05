package hometask_3;

import java.util.Scanner;

public class Task3_2 {

	public static boolean number(int a) {

		if ((a % 2) == 00) {
			System.out.println("Число является четным");
			return true;
		}

		else {
			System.out.println("Число является нечетным");
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите число:");
		int a = scanner.nextInt();
		number(a);
	}
}