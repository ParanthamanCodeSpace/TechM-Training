import java.util.LinkedList;

public class AppendToLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList and add initial elements
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Print original list
        System.out.println("Original LinkedList: " + colors);

        // Append an element to the end
        colors.addLast("Purple"); // OR colors.add("Purple");

        // Print updated list
        System.out.println("Updated LinkedList after appending: " + colors);
    }
}
