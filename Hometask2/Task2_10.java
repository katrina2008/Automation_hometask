package array1;

import java.util.Scanner;

public class Task2_10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int[] array = new int[size];

        System.out.println("Заполните массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] = " + array[i]);
        }

        System.out.println();

        boolean isAscending = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isAscending = false;
                break;
            }
        }

        if (isAscending)
            System.out.println("Массив возрастающий");
        else
            System.out.println("Массив не возрастающий");
    }
}
