package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        boolean rsl = false;
        if (left.length() == right.length()) {
            Map<Character, Integer> first = new HashMap<>();
            Map<Character, Integer> second = new HashMap<>();
            for (int index = 0; index < left.length(); index++) {
                incMapValue(first, left.toCharArray()[index]);
                incMapValue(second, right.toCharArray()[index]);
            }
            rsl = first.equals(second);

        }
        return rsl;
    }
    public static void incMapValue(Map<Character, Integer> map, char key) {
        int value = map.getOrDefault(key, 0);
        map.put(key, ++value);
    }
}