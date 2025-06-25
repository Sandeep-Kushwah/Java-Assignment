import java.util.HashSet;
public class HS76
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

        //Check common elements
        HashSet<String> common = new HashSet<>(set1);
        common.retainAll(set2);
        System.out.println("Common elements: " + common);
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
