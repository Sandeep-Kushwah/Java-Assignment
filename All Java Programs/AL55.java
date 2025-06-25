import java.util.ArrayList;

public class AL55 
{
    public static void main(String[] args) 
    {
        ArrayList<String> list = new ArrayList<>(20);

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("Size before trim: " + list.size());

        list.trimToSize();

        System.out.println("Capacity has been trimmed to match the current size.");
        System.out.println("Size after trim: " + list.size());
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
