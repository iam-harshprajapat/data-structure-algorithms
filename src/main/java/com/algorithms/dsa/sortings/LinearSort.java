package com.algorithms.dsa.sortings;

import static com.algorithms.dsa.util.CommonUtils.swap;

public class LinearSort {
    public static void linearSort(int[] x)
    {
        for(int i=0; i<x.length-1; i++)
        {
            for(int j=i+1; j<x.length; j++)
            {
                if(x[i]>x[j])
                {
                    swap(x,i,j);
                }
            }
        }
    }
}
