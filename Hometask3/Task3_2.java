package hometask_3;

import java.util.Scanner;

public class Task3_2 {

	public static boolean number(int a) {

		if ((a % 2) == 00) {
			System.out.println("����� �������� ������");
			return true;
		}

		else {
			System.out.println("����� �������� ��������");
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("������� �����:");
		int a = scanner.nextInt();
		number(a);
	}
}