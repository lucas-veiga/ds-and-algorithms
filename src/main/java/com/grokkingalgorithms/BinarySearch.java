package com.grokkingalgorithms;

public class BinarySearch {
    public static int iterativeSearch(int[] sortedArray, int key) {
        int left = 0;
        int right = sortedArray.length -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (sortedArray[mid] == key)
                return mid;
            else if (sortedArray[mid] < key)
                left = mid + 1;
            else if (sortedArray[mid] > key)
                right = mid - 1;
        }
        return -1;
    }

    public static int recursiveSearch(int[] sortedArray, int left, int right, int key) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (sortedArray[mid] == key)
                return mid;
            else if (sortedArray[mid] < key)
                return recursiveSearch(sortedArray, mid + 1, right, key);
            else if (sortedArray[mid] > key)
                return recursiveSearch(sortedArray, left, mid - 1, key);
        }
        return -1;
    }
}
