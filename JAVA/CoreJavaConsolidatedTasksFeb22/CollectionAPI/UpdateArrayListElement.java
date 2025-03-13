import java.util.ArrayList;
import java.util.List;

public class UpdateArrayListElement {
    public static void main(String[] args) {
        // Create an ArrayList and add initial elements
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Print original list
        System.out.println("Original List: " + colors);

        // Specify index and new value
        int index = 2; // Update the 3rd element (index starts from 0)
        String newValue = "Orange";

        // Update element at the given index
        if (index >= 0 && index < colors.size()) {
            colors.set(index, newValue);
            System.out.println("Updated List: " + colors);
        } else {
            System.out.println("Invalid index! Please enter a value between 0 and " + (colors.size() - 1));
        }
    }
}
