import java.util.List;
import Algorithms.BubbleSort;

public class Main {
    public static void main(String[] args) {
        TestArray test = new TestArray(50, 100);
        List<Integer> testArray = test.getArray();
        
        System.out.println("Unsorted array:\n" + testArray + "\n");
        BubbleSort.sort(testArray);
        System.out.println("Sorted array:\n" + testArray + "\n");
    }   
}
