import java.util.ArrayList;
import java.util.List;

public class RetrieveElement {
    public static void main(String[] args) {
        // Create an ArrayList and add elements
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Specify index to retrieve
        int index = 2; // Change this to test different indexes

        // Retrieve and print the element at the given index
        if (index >= 0 && index < colors.size()) {
            System.out.println("Element at index " + index + ": " + colors.get(index));
        } else {
            System.out.println("Invalid index! Please enter a value between 0 and " + (colors.size() - 1));
        }
    }
}
