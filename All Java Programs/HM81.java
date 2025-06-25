import java.util.HashMap;
import java.util.Map;
public class HM81
{
    public static void main(String[] args) 
    {
        HashMap<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "Apple");
        originalMap.put(2, "Banana");
        originalMap.put(3, "Cherry");
        HashMap<Integer, String> copiedMap = new HashMap<>(originalMap);

        System.out.println("Original Map: " + originalMap);
        System.out.println("Shallow Copied Map: " + copiedMap);
    }
    System.out.println("\nI am Sandeep Kushwah.");
    System.out.println("Roll No. : 0873CS231107");
}
