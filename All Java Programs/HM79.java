import java.util.HashMap;
import java.util.Map;
public class HM79
{
    public static void main(String[] args) 
    {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Blue");
        System.out.println("Original Map: " + map);

        map.clear();

        System.out.println("Map after removing all key-value pairs: " + map);
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
