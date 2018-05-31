package com.iuminov.binarysearch;

public class BinarySearchWithShift {
    private static int last;
    private static int mid;
    private static int first;

    static int find(int target, int[] array) {

        if (array.length < 1) {
            return -1;
        }

        last = array.length - 1;
        mid = last / 2;
        first = 0;

        while (last - first > 1) {
            if ((target < array[mid])) {
                if (target >= array[first]) {
                    moveDown();
                } else {
                    moveUp();
                }
            }
            else {
                if (target <= array[last] || (array[last] < array[mid])) {
                    moveUp();
                } else {
                    moveDown();
                }
            }
        }
        return (array[first] == target) ? first : ((array[last] == target) ? last : -1);
    }

    private static void moveUp() {
        first = mid;
        mid += (last - first) / 2;
    }

    private static void moveDown() {
        last = mid;
        mid -= (last - first) / 2;
    }
}
