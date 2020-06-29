package com.nyaxs.algorithm;

/**
 * @author nyaxs
 * @version V1.0
 * @Package com.nyaxs.algorithm
 * @date 2020/6/29 16:19
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] a = {8,1,2,5,6,19,54,33};
        System.out.println(search(a,19));
    }

    public static int search(int[] nums, int target) {
        if(nums.length<=0)
        {
            return -1;
        }
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while(low <= high){
            mid = low + (high - low) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
        }
        return -1;
    }
}
