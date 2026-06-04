package com.algorithms.dsa.sortings;

import static com.algorithms.dsa.util.CommonUtils.swap;

public class SelectionSort {
   public static void selectionSort(int x[])
   {
       for(int e=0;e<x.length-1;e++)
       {
           int si=e;
           for(int f=e+1; f<x.length;f++)
           {
               if(x[f]<x[si])si=f;
           }
           swap(x,e,si);
       }
   }
}
