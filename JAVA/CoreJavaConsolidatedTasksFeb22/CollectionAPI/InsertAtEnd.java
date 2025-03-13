import java.util.LinkedList;

public class InsertAtEnd {
    public static void main(String[] args) {
        // Create a LinkedList and add initial elements
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Print original list
        System.out.println("Original LinkedList: " + colors);

        // Insert an element at the end
        colors.addLast("Yellow"); // OR colors.add("Yellow");

        // Print updated list
        System.out.println("LinkedList after inserting at the end: " + colors);
    }
}
