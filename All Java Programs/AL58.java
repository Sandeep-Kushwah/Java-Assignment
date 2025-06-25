import java.util.ArrayList;
public class AL58 
{
    public static void main(String[] args) 
    {
        ArrayList<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        items.add("Date");

        // Print elements using their position (index)
        System.out.println("Elements of the ArrayList:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println("Element at index " + i + ": " + items.get(i));
        }
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
