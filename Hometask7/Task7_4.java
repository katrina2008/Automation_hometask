package hometask7;

import java.util.Scanner;

public class Task7_4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("¬ведите слова через пробел:");
        String wordsString = in.nextLine();

        String[] words = wordsString.split(" ");
        String[] uniqueChars = getUniqueChars(words);

        print("”никальные символы:", uniqueChars);

        int indexMinUniqueChars = getMinLengthIndex(uniqueChars);
        System.out.println("—лово с минимальным числом разных символов: " + words[indexMinUniqueChars]);
    }

    private static String[] getUniqueChars(String[] words) {
        String[] uniqueChars = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            uniqueChars[i] = "";
            for (char ch : words[i].toCharArray()) {
                if (uniqueChars[i].indexOf(ch) == -1) {
                    uniqueChars[i] += ch;
                }
            }
        }
        return uniqueChars;
    }

    private static int getMinLengthIndex(String[] strings) {
        int minIndex = 0;
        int minLength = strings[0].length();
        for (int i = 1; i < strings.length; i++) {
            int length = strings[i].length();
            if (length < minLength) {
                minLength = length;
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static void print(String title, String[] strings) {
        System.out.println(title);
        for (int i = 0; i < strings.length; i++) {
            System.out.println("[" + i + "] = " + strings[i]);
        }
        System.out.println();
    }
}