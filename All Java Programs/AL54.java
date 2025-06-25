import java.util.ArrayList;

public class AL54
{
    public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<>();

        if (list.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }

        // Add an element to the list
        list.add("Hello");

        // Check again
        if (list.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
