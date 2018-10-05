package array1;

import java.util.Scanner;

public class Task2_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("¬ведите размер массива: ");
        int size = in.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println("[" + i + "] = " + array[i]);
        }

        System.out.println();

        for (int i = 0; i < array.length; i = i + 3) {
            array[i] *= 2;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] = " + array[i]);
        }
    }
}
