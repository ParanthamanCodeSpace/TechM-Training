import java.util.LinkedList;

public class InsertAtSpecifiedPosition {
    public static void main(String[] args) {
        // Create a LinkedList and add initial elements
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Print original list
        System.out.println("Original LinkedList: " + colors);

        // Specify the position and elements to insert
        int index = 2; // Insert at index 2 (3rd position)
        colors.add(index, "Purple");
        colors.add(3, "Orange"); // Insert another element after "Purple"

        // Print updated list
        System.out.println("LinkedList after inserting elements at index " + index + ": " + colors);
    }
}
