import java.util.TreeSet;

public class TS69 
{
    public static void main(String[] args) 
    {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(50);
        treeSet.add(20);
        System.out.println("TreeSet : " + treeSet);
        int ct=0;
        for(Integer i:treeSet)
        {
            ct++;
        }
        System.out.println("Number of Element : " + ct);
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
