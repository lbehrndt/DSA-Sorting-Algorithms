// Packages
package Algorithms;

/*
BubbleSort is a simplet sorting algorithm. 
It repeatedly swaps neighboored elements, if those elements are un sorted (i-1 < i). 
This algortihm is ideal for large data sets due to the time complexity of average and worst cases (n^2)
*/
public class BubbleSort {

  /**
   * Sorts an array in ascending order by swapping an element if its bigger than
   * the ascending neighbor.
   * 
   * @param array The unsorted array.
   */
  public static void sort(int[] array) {
    // length of the array
    int n = array.length;

    // swap until nothing can be swapped
    while (n > 0) {
      // swap until bigger element has no smaller ascending neighbors
      for (int i = 1; i <= n - 1; i++) {
        // check if last element is bigger than current element
        if (array[i - 1] > array[i]) {
          // swap these elements
          swap(array, i, i - 1);
        }
      }
      // Decrement length by one.
      n--;
    }
  }

  /**
   * Swaps given indices from integer array.
   * 
   * @param array The array that contains to swapping value.
   * @param a     First value to be swapped
   * @param b     Second value to be swapped
   */
  public static void swap(int[] array, int a, int b) {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }
}
