package com.nyaxs.algorithm;

import java.util.Arrays;

/**
 * @author nyaxs
 * @version V1.0
 * @Package com.nyaxs.algorithm
 * @date 2020/6/23 23:10
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] array = {8,3,2,6,4,5,1,9};
        array = merge(array);
        System.out.println(Arrays.toString(array));
    }
    public static int[] merge(int[] array){
        if(array.length == 1) {
            return array;
        }
        int right = array.length;
        int mid = right/2;
        int[] a = merge(copyOfRange(array,0,mid));
        int[] b =  merge(copyOfRange(array,mid,right));
        return sort(a,b);
    }

    public static int[] sort(int[] a,int[] b){
        int[] result = new int[a.length + b.length];
        int ai = 0;
        int bi = 0;
        int ri = 0;
        while (ri < result.length){
            if(ai >= a.length){
                for (int i = bi; i < b.length; i++) {
                    result[ri++] = b[i];
                }
            }

            if(bi >= b.length){
                for (int i = ai; i < a.length; i++) {
                    result[ri++] = a[i];
                }
            }

            if(a[ai] <= b[bi]){
                result[ri++] = a[ai++];

            }
            else if(a[ai] > b[bi]){
                result[ri++] = b[bi++];
            }
            System.out.println(result[ri]);
        }
        return result;
    }

    public static int[] copyOfRange(int[] a, int left, int right){
        int size = right - left;
        int[] temp = new int[size];
        for (int i = 0; i <size; i++) {
            temp[i] = a[left++];
        }
        return temp;
    }

}
