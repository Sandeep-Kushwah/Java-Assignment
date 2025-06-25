import java.util.TreeSet;
import java.util.Iterator;

public class TS66 
{
    public static void main(String[] args) 
    {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(15);
        System.out.println("Original TreeSet: " + treeSet);

        System.out.println("TreeSet in reverse order:");
        Iterator<Integer> iterator = treeSet.descendingIterator();
        while (iterator.hasNext()) 
        {
            System.out.println(iterator.next());
        }
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
