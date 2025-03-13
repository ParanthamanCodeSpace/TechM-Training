import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArrayList {
    public static void main(String[] args) {
        // Create an ArrayList and add elements
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Print original list
        System.out.println("Original List: " + colors);

        // Shuffle the list randomly
        Collections.shuffle(colors);

        // Print shuffled list
        System.out.println("Shuffled List: " + colors);
    }
}
