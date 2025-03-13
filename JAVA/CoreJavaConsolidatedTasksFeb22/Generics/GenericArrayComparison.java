import java.util.Arrays;

public class GenericArrayComparison {
    // Generic method to compare two arrays
    public static <T> boolean areArraysEqual(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false; // Arrays must be of the same length
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false; // Elements must be in the same order
            }
        }
        return true; // Arrays are equal
    }

    public static void main(String[] args) {
        // Example 1: Integer arrays
        Integer[] intArray1 = {1, 2, 3, 4, 5};
        Integer[] intArray2 = {1, 2, 3, 4, 5};
        Integer[] intArray3 = {1, 2, 3, 5, 4};

        System.out.println("intArray1 == intArray2: " + areArraysEqual(intArray1, intArray2)); // true
        System.out.println("intArray1 == intArray3: " + areArraysEqual(intArray1, intArray3)); // false

        // Example 2: String arrays
        String[] strArray1 = {"apple", "banana", "cherry"};
        String[] strArray2 = {"apple", "banana", "cherry"};
        String[] strArray3 = {"banana", "apple", "cherry"};

        System.out.println("strArray1 == strArray2: " + areArraysEqual(strArray1, strArray2)); // true
        System.out.println("strArray1 == strArray3: " + areArraysEqual(strArray1, strArray3)); // false
    }
}
