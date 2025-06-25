import java.util.TreeSet;

public class TS68 
{
    public static void main(String[] args) 
    {
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(30);
        treeSet1.add(10);
        treeSet1.add(50);
        treeSet1.add(20);
        System.out.println("First TreeSet : " + treeSet1);

        TreeSet<Integer> treeSet2 = new TreeSet<>(treeSet1);
        System.out.println("Second TreeSet : " + treeSet2);
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
