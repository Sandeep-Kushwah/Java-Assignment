import java.util.TreeSet;

public class TS70 
{
    public static void main(String[] args) 
    {
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(30);
        treeSet1.add(10);
        treeSet1.add(50);
        treeSet1.add(20);

        TreeSet<Integer> treeSet2 = new TreeSet<>();
        treeSet2.add(50);
        treeSet2.add(20);
        treeSet2.add(30);
        treeSet2.add(10);
        String eq=(treeSet1.equals(treeSet2))? "Equals" : "Not Equals";
        System.out.println("Both TreeSet are : "+eq);
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
