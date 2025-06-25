import java.util.ArrayList;
import java.util.Iterator;
class AL38
{ 
    public static void main(String args[])
    {

        ArrayList<Object> al=new ArrayList<>();
        al.add("Blue");
        al.add("Black");
        al.add("Red");
        al.add("Green");
        al.add("White");
        al.add("Pink");
        al.add("Yellow");
        Iterator i=al.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}

