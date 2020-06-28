package com.nyaxs.algorithm;

import java.util.Arrays;

/**
 * @author nyaxs
 * @version V1.0
 * @Package com.nyaxs.algorithm
 * @date 2020/6/26 19:58
 */
public class InsertSort<T> {

    public static void main(String[] args) {
        Integer[] a = {8,3,2,6,4,5,1,9};
        System.out.println(Arrays.toString(insertSort(a)));

    }

    public static <T extends Comparable<T>> T[] insertSort(T[] a){
        T[] array = Arrays.copyOf(a,a.length);
        for (int i = 1; i < array.length; i++) {
            T temp = array[i];
            int j = i;
            while (j > 0 && temp.compareTo(array[j-1])<0){
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
