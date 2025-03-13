import java.util.List;
import java.util.Arrays;

public class GenericSumEvenOdd {
    // Generic method to sum even and odd numbers
    public static <T extends Number> void sumEvenOdd(List<T> numbers) {
        int evenSum = 0, oddSum = 0;

        for (T num : numbers) {
            int value = num.intValue(); // Convert to int for comparison
            if (value % 2 == 0) {
                evenSum += value;
            } else {
                oddSum += value;
            }
        }

        System.out.println("Sum of Even Numbers: " + evenSum);
        System.out.println("Sum of Odd Numbers: " + oddSum);
    }

    public static void main(String[] args) {
        // Example 1: Integer list
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Integer List:");
        sumEvenOdd(intList);

        // Example 2: Double list (Rounded down)
        List<Double> doubleList = Arrays.asList(1.5, 2.0, 3.2, 4.9, 5.1, 6.8, 7.3);
        System.out.println("\nDouble List:");
        sumEvenOdd(doubleList);
    }
}
