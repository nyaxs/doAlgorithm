package com.nyaxs.algorithm;

import java.util.Arrays;

import static com.nyaxs.algorithm.ComparableObject.compareResult;

/**
 * @author nyaxs
 * @version V1.0
 * @Package com.nyaxs.algorithm
 * @date 2020/6/27 15:26
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {8,3,2,6,4,5,1,9};
        Integer[] b = {8,3,2,6,4,5,1,9};
        String[] s = {"qwq","q","a","b","A","B","Q","QWQ"};
        System.out.println(Arrays.toString(selectSort(s)));
        System.out.println(Arrays.toString(selectSort(b)));
    }

   public static <T extends Comparable<T>> T[] selectSort(T[] array){
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = i+1; j < array.length; j++) {
                if ( array[j].compareTo(array[min]) < 0){
                    min = j;
                }
            }
            if(i != min){
                T temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }

        return array;
    }
}
