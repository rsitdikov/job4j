package ru.job4j.sort;

import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indexLeft = 0, indexRight = 0;
        while (indexLeft < left.length &  indexRight < right.length) {
            rsl[indexLeft + indexRight] = left[indexLeft] < right[indexRight] ? left[indexLeft++] : right[indexRight++];
        }
        while (indexRight < right.length) {
            rsl[indexRight + indexLeft] = right[indexRight++];
        }
        while (indexLeft < left.length) {
            rsl[indexRight + indexLeft] = left[indexLeft++];
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
