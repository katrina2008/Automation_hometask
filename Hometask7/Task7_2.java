package hometask7;

import java.util.Scanner;

public class Task7_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("¬ведите кол-во строк:");
        int size = in.nextInt();
        in.nextLine(); // consume the last newline char
        String[] strings = new String[size];

        System.out.println("¬ведите строки:");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = in.nextLine();
        }

        String temp;
        for (int i = 0; i < strings.length; i++) {
            for (int j = i; j < strings.length; j++) {
                if (strings[i].length() > strings[j].length()) {
                    temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.println("[" + i + "] = " + strings[i]);
        }
    }

}