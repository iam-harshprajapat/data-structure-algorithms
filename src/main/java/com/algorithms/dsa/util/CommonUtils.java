package com.algorithms.dsa.util;

public class CommonUtils {
    private CommonUtils(){}

    public static void swap(int x[], int i, int j)
    {
        int temp=x[i];
        x[i]=x[j];
        x[j]=temp;
    }
}
