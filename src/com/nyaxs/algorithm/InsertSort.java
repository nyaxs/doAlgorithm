package com.nyaxs.algorithm;

import java.util.Arrays;

/**
 * @author nyaxs
 * @version V1.0
 * @Package com.nyaxs.algorithm
 * @date 2020/6/26 19:58
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] a = {8,3,2,6,4,5,1,9};
        System.out.println(Arrays.toString(insertSort(a)));

    }

    public static int[] copyArray(int[] a){
        int[] array = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            array[i] = a[i];
        }
        return array;
    }

    public static int[] insertSort(int[] a){
        int[] array = copyArray(a);
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while (j > 0 && temp < array[j-1]){
                array[j] = array[j-1];
                j--;
            }
            if(j != i){
                array[j] = temp;
            }
        }
        return array;
    }

}
