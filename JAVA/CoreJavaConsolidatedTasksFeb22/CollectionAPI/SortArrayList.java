import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {
    public static void main(String[] args) {
        // Create an ArrayList and add elements
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Print original list
        System.out.println("Original List: " + colors);

        // Sort the list in ascending order
        Collections.sort(colors);

        // Print sorted list
        System.out.println("Sorted List (Ascending Order): " + colors);

        // Sort the list in descending order
        Collections.sort(colors, Collections.reverseOrder());

        // Print sorted list in descending order
        System.out.println("Sorted List (Descending Order): " + colors);
    }
}
