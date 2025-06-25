import java.util.LinkedList;

public class LL62 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        System.out.println("Forward direction : "+list);
        System.out.print("Reverse order : ");
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.print(list.get(i)+", ");
        }
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
