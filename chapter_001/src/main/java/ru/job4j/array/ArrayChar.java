package ru.job4j.array;

public class ArrayChar {

    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
              if (word[index] != pref[index]) {
                 result = false;
                 break;
             }
        }
        return result;
    }
}