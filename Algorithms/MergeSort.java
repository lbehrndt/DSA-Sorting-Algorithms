package Algorithms;

import java.util.List;

/**
 * MergeSort is an example for the divide and conquer strategy.
 * This algorithm takes an array and divides it recursivly into equally sized
 * subarrays.
 * When a subarray cannot be divided any further it will merge with the other
 * subarray of the before divided array in a sorted manner.
 * This process will be repeated until original array is sorted.
 */
public class MergeSort {

    /**
     * Sorts an array in ascending order by dividing the array into subarrays which
     * will be sorted. Afterwards these subarrays will be merged back to the
     * original array.
     * 
     * @param array The unsorted array.
     */
    private static void merge(List<Integer> array) {
        
    }
 
    
    public static void sort(List<Integer> array) {
        merge(array);
    }
}