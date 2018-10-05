package array1;

import java.util.Scanner;

public class Task2_8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println("[" + i + "] = " + array[i]);
        }

        System.out.println();

        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }

        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);
    }
}
