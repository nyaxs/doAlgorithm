package com.nyaxs.algorithm;

import java.util.Arrays;

/**
 * @author nyaxs
 * @version V1.0
 * @Package com.nyaxs.algorithm
 * @date 2020/6/29 17:50
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1,3,2,0,9,7,5,8,33,65,12,4,67,76,45,54,55,49,95};
        System.out.println(Arrays.toString(quickSort(arr,0,arr.length-1)));

    }
    public static int[] quickSort(int[] arr, int left, int right){
        if (left < right) {
            int partitionIndex = partition(arr, left, right);
            quickSort(arr, left, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, right);
        }
        return arr;
    }

    private static int partition(int[] arr, int left, int right) {
        // 设定基准值（pivot）
        int pivot = left;
        int index = pivot + 1;
        for (int i = index; i <= right; i++) {
            if (arr[i] < arr[pivot]) {
                swap(arr, i, index);
                index++;
            }
        }
        swap(arr, pivot, index - 1);
        return index - 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
