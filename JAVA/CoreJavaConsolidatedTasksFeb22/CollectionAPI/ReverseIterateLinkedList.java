import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseIterateLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList and add elements
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Create a ListIterator to iterate in reverse order
        ListIterator<String> iterator = colors.listIterator(colors.size());

        // Print elements in reverse order
        System.out.println("Iterating LinkedList in Reverse Order:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
