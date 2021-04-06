package com.grokkingalgorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    @Test
    public void binarySearch() {
        int arr[] = { 2, 3, 4, 10, 40 };
        int result = BinarySearch.search(arr, 4);
        assertEquals(2, result);
    }

}
