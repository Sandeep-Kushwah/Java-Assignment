import java.util.LinkedList;
import java.util.Iterator;
public class LL60 
{
    public static void main(String[] args) 
    {
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        animals.add("Elephant");

        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = animals.iterator();
        while (iterator.hasNext()) 
        {
            System.out.println(iterator.next());
        }
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
