package array1;

import java.util.Scanner;

public class Task2_6 {

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

        int temp;
        for (int i = 0; i < array.length; i += 2) {
            temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] = " + array[i]);
        }
    }
}
