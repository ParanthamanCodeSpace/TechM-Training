import java.util.List;
import java.util.Arrays;

public class GenericFindIndex {
    // Generic method to find the index of the first occurrence of target
    public static <T> int findFirstIndex(List<T> list, T target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i; // Return the index of first occurrence
            }
        }
        return -1; // Return -1 if target is not found
    }

    public static void main(String[] args) {
        // Example 1: Integer list
        List<Integer> intList = Arrays.asList(10, 20, 30, 40, 50, 30);
        System.out.println("Index of 30 in intList: " + findFirstIndex(intList, 30)); // Output: 2
        System.out.println("Index of 100 in intList: " + findFirstIndex(intList, 100)); // Output: -1

        // Example 2: String list
        List<String> strList = Arrays.asList("apple", "banana", "cherry", "banana", "date");
        System.out.println("Index of 'banana' in strList: " + findFirstIndex(strList, "banana")); // Output: 1
        System.out.println("Index of 'grape' in strList: " + findFirstIndex(strList, "grape")); // Output: -1
    }
}
