import java.util.TreeSet;

public class TS67 
{
    public static void main(String[] args) 
    {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(50);
        treeSet.add(20);
        System.out.println("TreeSet: " + treeSet);

        Integer firstElement = treeSet.first();
        System.out.println("First Element: " + firstElement);

        Integer lastElement = treeSet.last();
        System.out.println("Last Element: " + lastElement);
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
