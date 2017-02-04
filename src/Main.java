import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] input = {5,1245,22,124,54,1,9,-12};
        int searchedItem = 10;

        // int[] = BubbleSort.sort(input)
        // int[] = InsertionSort.sort(input)
        // int[] = SelectionSort.sort(input)
        // int[] = QuickSort.initialise(input)
        // int = BinarySearch.search(searchedItem, input)
        // int = LinearSearch.search(searchedItem, input)

        //System.out.println(Arrays.toString(QuickSort.initialise(input)));
        //System.out.println("Merge: " + Arrays.toString(MergeSort.initialise(input)));
        System.out.println(Arrays.toString(HeapSort.sort(input)));

    }

}
