import java.util.LinkedList;
import java.util.Scanner;

public class LL63 {
    public static void main(String[] args) {
        String ele;
        LinkedList<Object> list = new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        list.add("Apple");
        list.add(12);
        list.add("Cherry");
        list.add(45.36);
        list.add("Elderberry");
        System.out.println(list);

        System.out.print("Enter index : ");
        int index=sc.nextInt();
        sc.nextLine(); //To avoid enter as Input in ele.
        
        try{
            System.out.println("Enter Element : ");
            ele=sc.nextLine();
        
            if(index>=0 && index <list.size())
            {
                list.add(index,ele);
                System.out.println(list);
            }else
            System.out.println("Index out of bound.");
        }catch(Exception e)
        {System.out.println("Invalid input");}
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
