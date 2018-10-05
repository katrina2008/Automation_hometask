package array1;

import java.util.Scanner;

public class Task2_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("¬ведите размер массива: ");
        int size = in.nextInt();

        int result = 1;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println("[" + i + "] = " + array[i]);
            result = result * array[i];
        }

        System.out.println();

        System.out.println("–езультат = " + result);
    }
}