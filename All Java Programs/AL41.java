import java.util.ArrayList;
import java.util.Scanner;

public class AL41
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
        System.out.print("Enter the index of the element you want to Update : ");
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index >= 0 && index < fruits.size()) 
        {
            System.out.print("What do you want to insert(Only String) : ");
            String element = scanner.nextLine();
            fruits.add(index,element);
            System.out.println("!!! Successfully Added !!!");
            System.out.println(fruits);
        } else
        {
            System.out.println("Invalid index! Please enter a number between 0 and " + (fruits.size() - 1));
        }
        scanner.close();
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
