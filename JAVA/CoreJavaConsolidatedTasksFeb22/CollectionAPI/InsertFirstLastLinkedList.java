import java.util.LinkedList;

public class InsertFirstLastLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList and add initial elements
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Print original list
        System.out.println("Original LinkedList: " + colors);

        // Insert an element at the first position
        colors.addFirst("Purple"); // OR colors.add(0, "Purple");

        // Insert an element at the last position
        colors.addLast("Yellow"); // OR colors.add("Yellow");

        // Print updated list
        System.out.println("LinkedList after inserting at first and last positions: " + colors);
    }
}
