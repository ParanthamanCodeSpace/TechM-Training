import java.util.ArrayList;
import java.util.List;

public class SearchArrayList {
    public static void main(String[] args) {
        // Create an ArrayList and add elements
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Element to search for
        String searchElement = "Blue";

        // Check if the element exists in the list
        if (colors.contains(searchElement)) {
            int index = colors.indexOf(searchElement);
            System.out.println(searchElement + " found at index: " + index);
        } else {
            System.out.println(searchElement + " not found in the list.");
        }
    }
}
