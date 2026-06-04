package com.algorithms.dsa.sortings;

import com.algorithms.dsa.util.Queue;

public class RadixSort {

    public void radixSort(int[] x) {
        Queue<Integer>[] posQueue = new Queue[10];
        Queue<Integer>[] negQueue = new Queue[10];
        for (int i = 0; i < 10; i++) {
            posQueue[i] = new Queue<>();
            negQueue[i] = new Queue<>();
        }

        int maxNum = findMaxElement(x);
        int minNum = findMinElement(x);
        int digitCountForMax = countDigit(maxNum);
        int digitCountForMin = countDigit(minNum);
        int digitCount = Math.max(digitCountForMax, digitCountForMin);
        int i = 0, e = 1, f = 10;
        while (i < digitCount) {
            for (int j = 0; j < x.length; j++) {
                int rem = x[j] % f;
                int place = rem / e;
                if (x[j] < 0)
                    negQueue[place * -1].add(x[j]);
                else posQueue[place].add(x[j]);
            }

            int k = 0;
            for (int j = negQueue.length-1; j >=0; j--) {
                while (!negQueue[j].isEmpty()) {
                    x[k] = negQueue[j].remove();
                    k++;
                }
            }
            for(int j=0;j<posQueue.length; j++)
            {
                while (!posQueue[j].isEmpty())
                {
                    x[k]=posQueue[j].remove();
                    k++;
                }
            }
            e = e * 10;
            f = f * 10;
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

    private int findMinElement(int[] x) {
        int smallest = x[0];
        for (int currNum : x) {
            if (currNum < smallest) smallest = currNum;
        }
        return smallest;
    }
}
