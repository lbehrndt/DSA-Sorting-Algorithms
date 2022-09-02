
import java.util.Arrays;

import Algorithms.BubbleSort;
import Algorithms.MergeSort;

public class Main {
    public static void main(String[] args) {
        int arrayLength = 20;
        int[] testArray = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++) {
            testArray[i] = (int) Math.floor(Math.random() * 100);
        }
        
        print("merge", testArray);
    }

    private static void print(String algorithm, int[] array) {

        System.out.println("Unsorted array:\n" + Arrays.toString(array) + "\n");
        switch(algorithm) {
            case "merge":
                MergeSort.sort(array, 0, array.length-1);
                break;
            case "bubble":
                BubbleSort.sort(array);
                break;
        }
        System.out.println("With " + algorithm + "Sort sorted array:\n" + Arrays.toString(array) + "\n");
    }
}
