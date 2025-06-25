import java.util.ArrayList;

public class AL42
{
    public static void main(String[] args) 
    {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Mango");
        
        System.out.println("Original list : "+fruits);
        fruits.remove("Banana");
        System.out.println("Removed List: " + fruits);
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
