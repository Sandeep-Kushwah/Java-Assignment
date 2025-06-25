import java.util.LinkedList;
import java.util.Scanner;

public class LL59 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Original LinkedList: " + list);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an element to append at the end: ");
        int element = sc.nextInt();

        list.addLast(element); 
        System.out.println("Updated LinkedList: " + list);
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
