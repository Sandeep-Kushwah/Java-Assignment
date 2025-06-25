import java.util.HashMap;
import java.util.Map;
public class HM78
{
    public static void main(String[] args) 
    {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Apple");
        map1.put(2, "Banana");
        map1.put(3, "Cherry");

        Map<Integer, String> map2 = new HashMap<>();

        map2.putAll(map1);

        System.out.println("Original Map (map1): " + map1);
        System.out.println("Copied Map (map2): " + map2);
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
