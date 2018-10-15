package hometask7;

import java.util.Scanner;

public class Task7_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ���-�� �����:");
        int size = in.nextInt();
        in.nextLine(); // consume the last newline char
        String[] strings = new String[size];

        System.out.println("������� ������:");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = in.nextLine();
        }

        float lengthAverage = 0;
        for (int i = 0; i < strings.length; i++) {
            lengthAverage += strings[i].length();
        }
        lengthAverage = lengthAverage / strings.length;

        System.out.println("������� ����� ������: " + lengthAverage);

        String[] more = new String[size];
        String[] less = new String[size];

        int moreIndex = 0, lessIndex = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > lengthAverage) {
                more[moreIndex++] = strings[i];
            } else {
                less[lessIndex++] = strings[i];
            }
        }
        print("������ � ������ ������ �������:", less);
        print("������ � ������ ������ �������:", more);
    }

    private static void print(String title, String[] strings) {
        System.out.println(title);
        for (int i = 0; i < strings.length; i++) {
            System.out.println("[" + i + "] = " + strings[i]);
        }
        System.out.println();
    }
}