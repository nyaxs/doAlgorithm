package com.nyaxs.algorithm;

import java.util.Arrays;

/**
 * @author nyaxs
 * @version V1.0
 * @Package com.nyaxs.algorithm
 * @date 2020/6/29 16:44
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {1,3,2,0,9,7,5,8,33,65,12,4,67,76,45,54,55,49,95};
        System.out.println(Arrays.toString(shellSort(arr)));
    }

    public static int[] shellSort(int[] arr){
        int i, j, temp, gap;
        int f = 2;
        for (gap = arr.length / f; gap > 0; gap /= f){
            for (i = gap; i < arr.length; i++){
                temp = arr[i];
                for (j = i - gap; j >=0 && temp <arr[j]; j -= gap){
                    arr[j + gap] = arr[j];
                }
                arr[j + gap] = temp;
            }
        }
        return arr;
    }

}
