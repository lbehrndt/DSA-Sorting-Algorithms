import java.util.List;
import Algorithms.BubbleSort;
import Algorithms.MergeSort;

public class Main {
    public static void main(String[] args) {
        TestArray test = new TestArray(50, 100);
        List<Integer> testArray = test.getArray();
        
        print("merge", testArray);
    }

    private static void print(String algorithm, List<Integer> array) {

        System.out.println("Unsorted array:\n" + array + "\n");
        switch(algorithm) {
            case "merge":
                MergeSort.sort(array);
                break;
            case "bubble":
                BubbleSort.sort(array);
                break;
        }
        System.out.println("With " + algorithm + "Sort sorted array:\n" + array + "\n");
    }
}
