package com.grokkingalgorithms;

public class BinarySearch {
    public static int search(int[] sortedArray, int key) {
        int left = 0;
        int right = sortedArray.length -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (sortedArray[mid] == key) {
                return mid;
            } else if (sortedArray[mid] < key) {
                left = mid + 1;
            } else if (sortedArray[mid] > key) {
                right = mid - 1;
            }
        }
        return -1;
    }
}
