package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        boolean rsl = false;
        if (left.length() == right.length()) {
            List<Character> first = new ArrayList<>();
            List<Character> second = new ArrayList<>();
            for (int index = 0; index < left.length(); index++) {
                first.add(left.toCharArray()[index]);
                second.add(right.toCharArray()[index]);
            }
            first.sort(Comparator.naturalOrder());
            second.sort(Comparator.naturalOrder());
            rsl = first.equals(second);
        }
        return rsl;
    }
}