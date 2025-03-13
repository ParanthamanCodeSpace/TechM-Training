import java.util.Arrays;

public class EqualsVsDeepEquals {
    public static void main(String[] args) {
        // 1D Arrays (Simple Arrays)
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        
        // 2D Arrays (Nested Arrays)
        int[][] nestedArr1 = {{1, 2}, {3, 4}};
        int[][] nestedArr2 = {{1, 2}, {3, 4}};

        // Shallow Comparison: Compares references (not content)
        System.out.println("1D Arrays using equals(): " + Arrays.equals(arr1, arr2)); // true
        System.out.println("2D Arrays using equals(): " + Arrays.equals(nestedArr1, nestedArr2)); // false (compares outer references)

        // Deep Comparison: Compares actual values inside arrays
        System.out.println("2D Arrays using deepEquals(): " + Arrays.deepEquals(nestedArr1, nestedArr2)); // true
    }
}
