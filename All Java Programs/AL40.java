import java.util.ArrayList;
import java.util.Scanner;

public class AL40
{
    public static void main(String[] args) 
    {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Mango");
        System.out.println("Fruit List: " + fruits);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the element you want to retrieve: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < fruits.size()) 
        {
            String element = fruits.get(index);
            System.out.println("Element at index " + index + " is: " + element);
        } else
        {
            System.out.println("Invalid index! Please enter a number between 0 and " + (fruits.size() - 1));
        }
        scanner.close();
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
