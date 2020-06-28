package com.nyaxs.algorithm;

import java.util.Arrays;

/**
 * @author nyaxs
 * @version V1.0
 * @Package com.nyaxs.algorithm
 * @date 2020/6/28 17:21
 */
public class BubbleSort {
    public static void main(String[] args) {
        Integer[] b = {8,3,2,6,4,5,1,9};
        String[] s = {"qwq","q","a","b","A","B","Q","QWQ"};
        System.out.println(Arrays.toString(bubbleSort(s)));
        System.out.println(Arrays.toString(bubbleSort(b)));
    }

    public static <T extends Comparable<T>>  T[] bubbleSort(T[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j].compareTo(arr[j+1])>0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

}
