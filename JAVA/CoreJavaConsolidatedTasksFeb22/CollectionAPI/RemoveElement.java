import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
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

        // Check if the list has at least 3 elements
        int indexToRemove = 2; // Third element (index starts from 0)
        if (indexToRemove < colors.size()) {
            // Remove the third element
            colors.remove(indexToRemove);
            System.out.println("Updated List after removing the third element: " + colors);
        } else {
            System.out.println("List does not have enough elements to remove.");
        }
    }
}
