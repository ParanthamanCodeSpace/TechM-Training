import java.util.Arrays;

public class AlternateArrayCopy {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Find the size of the new array (half the original, rounded up)
        int newSize = (originalArray.length + 1) / 2;
        int[] alternateArray = new int[newSize];

        // Copy alternate elements
        int index = 0;
        for (int i = 0; i < originalArray.length; i += 2) {
            alternateArray[index++] = originalArray[i];
        }

        // Print the result
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Alternate Elements Array: " + Arrays.toString(alternateArray));
    }
}
