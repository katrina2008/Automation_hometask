package array1;

import java.util.Scanner;

public class Task2_5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ������ �������: ");
        int size = in.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.println("[" + i + "] = " + array[i]);
        }

        System.out.println();

        int result = 0;
        String zeroElements = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                result++;
                zeroElements = zeroElements + '[' + i + ']';
            }
        }

        if (result > 0)
            System.out.println("������� ��������: " + zeroElements);
        else
            System.out.println("������� ��������� ���");
    }
}