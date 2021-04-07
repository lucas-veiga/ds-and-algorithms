package com.grokkingalgorithms;

import java.util.Arrays;

public class SelectionSort {

    public static void sortAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest])
                    smallest = j;
            }
            swap(arr, i, smallest);
        }
    }

    public static void sortDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int highest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[highest])
                    highest = j;
            }
            swap(arr, i, highest);
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
