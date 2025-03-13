import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GenericReverseList {
    // Generic method to reverse a list
    public static <T> List<T> reverseList(List<T> list) {
        List<T> reversedList = new ArrayList<>(list); // Create a copy of the original list
        Collections.reverse(reversedList); // Reverse the list
        return reversedList;
    }

    public static void main(String[] args) {
        // Example 1: Integer list
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Original Integer List: " + intList);
        System.out.println("Reversed Integer List: " + reverseList(intList));

        // Example 2: String list
        List<String> strList = Arrays.asList("apple", "banana", "cherry", "date");
        System.out.println("\nOriginal String List: " + strList);
        System.out.println("Reversed String List: " + reverseList(strList));
    }
}
