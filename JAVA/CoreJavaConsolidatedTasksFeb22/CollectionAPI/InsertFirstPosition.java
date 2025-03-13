import java.util.ArrayList;
import java.util.List;

public class InsertFirstPosition {
    public static void main(String[] args) {
        // Create an ArrayList and add initial elements
        List<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Print original list
        System.out.println("Original List: " + colors);

        // Insert "Red" at the first position (index 0)
        colors.add(0, "Red");

        // Print updated list
        System.out.println("Updated List after insertion: " + colors);
    }
}
