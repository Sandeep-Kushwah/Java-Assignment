import java.util.HashSet;
import java.util.TreeSet;
public class HS73
{
    public static void main(String[] args) 
    {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Cherry");

        TreeSet<String> treeSet = new TreeSet<>(hashSet);

        System.out.println("TreeSet (sorted):");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
