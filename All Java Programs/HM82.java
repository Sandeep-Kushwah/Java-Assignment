import java.util.HashMap;
import java.util.Map;
public class HM82
{
    public static void main(String[] args) 
    {
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "John");
        map.put(102, "Emma");
        map.put(103, "Alex");

        int keyToCheck = 102;

        System.out.println("Map is : "+map);
        if (map.containsKey(keyToCheck)) 
        {
            System.out.println("Key " + keyToCheck + " exists in the map.");
        } else 
        {
            System.out.println("Key " + keyToCheck + " does NOT exist in the map.");
        }
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
