import java.util.Arrays;

public class ArrayCopyRange {
    public static void main(String[] args) {
        // Original array
        int[] originalArray = {10, 20, 30, 40, 50, 60, 70};

        // Copy a range of elements (from index 2 to 5)
        int[] copiedArray = Arrays.copyOfRange(originalArray, 2, 5);

        // Display results
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Copied Range Array: " + Arrays.toString(copiedArray));
    }
}
