package com.algorithms.dsa.sortings;

public class InsertionSort {
    public static void insertionSort(int[] x) {
        for (int e = 1; e < x.length; e++) {
            int f = e - 1;
            int element = x[e];
            while (f >= 0 && x[f] > element) {
                x[f + 1] = x[f];
                f--;
            }
            x[f + 1] = element;
        }
    }
}
