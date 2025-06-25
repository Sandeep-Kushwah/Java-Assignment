import java.util.TreeSet;

public class HS74 
{
    public static void main(String[] args) 
    {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(4);
        treeSet.add(50);
        treeSet.add(6);
        treeSet.add(20);
        treeSet.add(7);
        
        for(Integer i:treeSet)
        {
            if(i<7)
            System.out.println("Less than 7 > "+i);
            else if(i==7)
            System.out.println("Both are equal 7 = "+i);
            else
            System.out.println("grater than 7 < "+i);
        }
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
