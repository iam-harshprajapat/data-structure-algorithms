package com.algorithms.dsa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.algorithms.dsa.sortings.SelectionSort.selectionSort;

@SpringBootApplication
public class DsaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DsaApplication.class, args);
        int[] x = {100, 80, 45, 0, -54, 24, 3, 458, -155, 3, 11};
        selectionSort(x);
        for (int j : x) {
            System.out.print(j + " ");
        }
    }

}
