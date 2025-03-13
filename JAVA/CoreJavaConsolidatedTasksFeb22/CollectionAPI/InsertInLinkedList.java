import java.util.LinkedList;

public class InsertInLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList and add initial elements
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Print original list
        System.out.println("Original LinkedList: " + colors);

        // Insert a new element at a specified position
        int index = 2; // Insert at index 2 (3rd position)
        String newColor = "Purple";

        // Check if index is valid before inserting
        if (index >= 0 && index <= colors.size()) {
            colors.add(index, newColor);
            System.out.println("LinkedList after inserting '" + newColor + "' at index " + index + ": " + colors);
        } else {
            System.out.println("Invalid index! Please enter a value between 0 and " + colors.size());
        }
    }
}
