import java.util.ArrayList;
import java.util.Collections;

public class AL46
{
    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Original List: " + colors);

        // Shuffle the list
        Collections.shuffle(colors);

        System.out.println("Shuffled List: " + colors);
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
