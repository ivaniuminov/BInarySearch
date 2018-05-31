package com.iuminov.binarysearch;

public class BinarySearch {

    static int find(int target, int[] array) {

        if (array.length < 1) {
            return -1;
        }

        int last = array.length - 1;
        int mid = last / 2;
        int first = 0;

        while (last - first > 1) {

            if ((target < array[mid])) {
                last = mid;
                mid -= (last - first) / 2;
            } else {
                first = mid;
                mid += (last - first) / 2;
            }
        }
        return (array[first] == target) ? first : ((array[last] == target) ? last : -1);
    }
}
