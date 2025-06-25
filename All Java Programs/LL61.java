import java.util.LinkedList;

public class LL61 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        int startIndex = 2;

        System.out.println("Iterating from index " + startIndex + ":");
        for (int i = startIndex; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
