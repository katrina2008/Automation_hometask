package hometask7;

import java.util.Scanner;

public class Task7_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во строк:");
        int size = in.nextInt();
        in.nextLine(); // consume the last newline char
        String[] strings = new String[size];

        System.out.println("Введите строки:");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = in.nextLine();
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println("[" + i + "] = " + strings[i]);
        }

        System.out.println();

        int minLength = strings[0].length();
        int maxLength = strings[0].length();
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < strings.length; i++) {
            int length = strings[i].length();
            if (length < minLength) {
                minLength = length;
                minIndex = i;
            }
            if (length > maxLength) {
                maxLength = length;
                maxIndex = i;
            }
        }

        System.out.println("Короткая строка: [" + strings[minIndex] + "], длина: [" + minLength + "]");
        System.out.println("Длинная строка: [" + strings[maxIndex] + "], длина: [" + maxLength + "]");
    }
}