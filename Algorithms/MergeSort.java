package Algorithms;

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
    private static void merge(int[] array, int left, int mid, int right) {
        // store length of left array
        int nl = mid - left + 1;
        // store length of right array
        int nr = right - mid;

        // copy of left array
        int[] L = new int[nl];
        // copy of right array
        int[] R = new int[nr];
        // add items to left subarray
        for (int i = 0; i < nl; i++) {
            L[i] = array[left + i];
        }
        // add items to right subarray
        for (int j = 0; j < nr; j++) {
            R[j] = array[mid + 1 + j];
        }

        // store indices for left...
        int i = 0;
        // ..right...
        int j = 0;
        // ...and main array
        int k = left;

        /*
         * Until either the end of left or right subarray is reached, compare elements
         * from those arrays and pick the larger value to place them in the correct
         * position.
         */
        while (i < nl && j < nr) {
            // if item from left subarray is smaller than item from right subarray
            if (L[i] <= R[j]) {
                // put item from left subarray to the main array
                array[k] = L[i];
                i++;
            } else {
                // put item from right subarray to the main array
                array[k] = R[j];
                j++;
            }
            // increment main array index;
            k++;
        }

        /*
         * When we do not have any elements left in either left or right we must append
         * the remaining items to the main array.
         */
        // append remaining elements from left subarray
        while (i < nl) {
            array[k] = L[i];
            i++;
            k++;
        }
        // append remaining elements from right subarray
        while (j < nr) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(int[] array, int left, int right) {
        // if array contains one element
        if (left < right) {
            // find middle of array
            int mid = (right - left) / 2;

            // divide left part recursively until only one element leftover
            sort(array, left, mid-1);
            // divide right part recursively until only one element leftover
            sort(array, mid, right);
            
            // merge the remaining subarrays
            merge(array, left, mid, right);
        }
    }
}