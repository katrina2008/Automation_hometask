package array1;

import java.util.Scanner;

public class Task2_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.println("[" + i + "] = " + array[i]);
        }

        System.out.println();

        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) result++;
        }

        if (result > 0)
            System.out.println("Нулевых элементов: " + result);
        else
            System.out.println("Нулевых элементов нет");
    }
}
