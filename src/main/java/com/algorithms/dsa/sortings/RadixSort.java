package com.algorithms.dsa.sortings;

import com.algorithms.dsa.util.Queue;

public class RadixSort {

    public void radixSort(int[] x) {
        Queue<Integer>[] queue = new Queue[10];
        for (int i = 0; i < queue.length; i++) {
            queue[i] = new Queue<>();
        }

        int maxNum = findMaxElement(x);
        int digitCount = countDigit(maxNum);
        int i = 0, e = 1, f = 10;
        while (i < digitCount) {
            for (int j = 0; j < x.length; j++) {
                int rem = x[j] % f;
                int place = rem / e;
                queue[place].add(x[j]);
            }

            int k = 0;
            for (int j = 0; j < queue.length; j++) {
                while (!queue[j].isEmpty()) {
                    x[k] = queue[j].remove();
                    k++;
                }
            }
            e=e*10;
            f=f*10;
            i++;
        }
    }

    private int findMaxElement(int[] x) {
        int largest = x[0];
        for (int currNum : x) {
            if (currNum > largest) largest = currNum;
        }
        return largest;
    }

    private int countDigit(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
