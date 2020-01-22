package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int start = 0; start <= data.length - 1; start++) {
            int min = MinDiapason.findMin(data, start, data.length - 1);
            int index = FindLoop.indexOf(data, min, start, data.length - 1);
            data[index] = data[start];
            data[start] = min;
        }
        return data;
    }
}