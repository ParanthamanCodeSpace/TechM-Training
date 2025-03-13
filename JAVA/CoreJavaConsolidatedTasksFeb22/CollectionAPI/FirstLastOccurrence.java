import java.util.LinkedList;

public class FirstLastOccurrence {
    public static void main(String[] args) {
        // Create a LinkedList and add elements (with duplicates)
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green"); // Duplicate
        colors.add("Purple");

        // Print original list
        System.out.println("LinkedList: " + colors);

        // Element to search for
        String searchElement = "Green";

        // Get first and last occurrence
        int firstIndex = colors.indexOf(searchElement);
        int lastIndex = colors.lastIndexOf(searchElement);

        // Print results
        if (firstIndex != -1) {
            System.out.println("First occurrence of '" + searchElement + "' is at index: " + firstIndex);
            System.out.println("Last occurrence of '" + searchElement + "' is at index: " + lastIndex);
        } else {
            System.out.println("Element '" + searchElement + "' not found in the LinkedList.");
        }
    }
}
