import java.util.Arrays;

public class MultiThreadMergeSort {
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original Array: " + Arrays.toString(array));

        // Creating a thread to sort the array
        MergeSortThread sorter = new MergeSortThread(array);
        sorter.start();

        try {
            sorter.join(); // Wait for sorting to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
