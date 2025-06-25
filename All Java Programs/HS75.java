import java.util.HashSet;
public class HS75 
{
    public static void main(String[] args) 
    {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Mango");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Banana");
        set2.add("Apple");
        set2.add("Mango");

        if (set1.equals(set2)) {
            System.out.println("HashSets are equal.");
        } else {
            System.out.println("HashSets are NOT equal.");
        }
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
