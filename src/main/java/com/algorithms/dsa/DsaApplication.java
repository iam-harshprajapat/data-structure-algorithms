package com.algorithms.dsa;

import com.algorithms.dsa.sortings.RadixSort;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.algorithms.dsa.sortings.InsertionSort.insertionSort;
import static com.algorithms.dsa.sortings.SelectionSort.selectionSort;
import static com.algorithms.dsa.sortings.LinearSort.linearSort;

@SpringBootApplication
public class DsaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsaApplication.class, args);
        int[] x = {100, 80, -45, 0, 54, -24, 3, 458, -155, 3, 11};
        RadixSort sort=new RadixSort();
        sort.radixSort(x);
        for (int j : x) {
            System.out.print(j + " ");
        }
    }

}
