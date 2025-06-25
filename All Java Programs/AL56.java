import java.util.ArrayList;
public class AL56
{
    public static void main(String[] args) 
    {
        //default capacity (10)
        ArrayList<String> list = new ArrayList<>();

        list.add("One");
        list.add("Two");

        list.ensureCapacity(20);

        System.out.println("ArrayList size: " + list.size());
        System.out.println("Capacity has been increased to at least 20 (internally).");

        list.add("Three");
        list.add("Four");

        System.out.println("Updated ArrayList: " + list);
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
