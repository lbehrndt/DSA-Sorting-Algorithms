// Packages
package Algorithms;

// Imports
import java.util.Collections;
import java.util.List;

/*
BubbleSort is the simplest sorting algorithm. 
It repeatedly swaps neighboored elements, if those elements are un sorted (i-1 < i). 
This algortihm is ideal for large data sets due to the time complexity of average and worst cases (n^2)
*/
public class BubbleSort {
  
  /** 
   * Sorts an array in ascending order by swapping an element if its bigger than the ascending neighbor.
   * 
   * @param array The unsorted array.
   */  
  public static void sort(List<Integer> array) {
    // length of the array
    int n = array.size();
    
    // swap until nothing can be swapped
    while (n > 0) {
      // swap until bigger element has no smaller ascending neighbors
      for (int i = 1; i <= n - 1; i++){
        // check if last element is bigger than current element
        if (array.get(i-1) > array.get(i)) {
          // swap these elements
          Collections.swap(array, i, i-1);
        }
      }
      // Decrement length by one.
      n = n - 1;
    }
  }
}

