import java.util.TreeSet;
import java.util.Iterator;
class TS65
{
    public static void main(String args[])
    {
        TreeSet<Integer> ts1=new TreeSet<>();
        
        ts1.add(20);
        ts1.add(30);
        ts1.add(10);
        ts1.add(50);
        System.out.println("first TreeSet : "+ts1);

        TreeSet<Integer> ts2=new TreeSet<>();
        // ts2.addAll(ts1);
        // System.out.println(ts2);

        for(int i:ts1)
        {
            ts2.add(i);
        }
        System.out.println("Second TreeSet : "+ts2);
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}