import java.util.LinkedList;
import java.util.Scanner;

public class LL64 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("List : "+list);

        System.out.print("Enter first element (only int) : ");
        int first=sc.nextInt();
        System.out.print("Enter last element (only int) : ");
        int last=sc.nextInt();
        
        list.add(0,first);
        list.addLast(last);
        System.out.println("Updated LinkedList: " + list);
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
