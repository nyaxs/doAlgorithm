package com.nyaxs.algorithm;

/**
 * @author nyaxs
 * @version V1.0
 * @Package com.nyaxs.algorithm
 * @date 2020/6/28 12:09
 */
public class ComparableObject<T> {
    private T t;

    public static void main(String[] args) {
        System.out.println( compareResult(12,11));
    }

    public ComparableObject(T t) {
        this.t = t;
    }


    public static  <T extends Comparable> int compareResult(T a, T another) {
        return  a.compareTo(another);
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
