package com.artiomtb.sorting;

import java.util.Comparator;

public class Sorter {

    public static <T> void sort(T[] list, Comparator<T> comparator) {
        int collectionLength = list.length;
        for (int i = 0; i < collectionLength - 1; i++) {
            for (int j = 1; j < collectionLength - i; j++) {
                if (comparator.compare(list[j - 1], list[j]) > 0) {
                    T temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }
    }
}
