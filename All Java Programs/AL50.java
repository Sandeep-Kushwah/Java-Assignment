import java.util.Scanner;
import java.util.ArrayList;
class AL50
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        al.add(45);
        al.add(456);
        al.add(89);
        al.add(84);
        al.add(78);
        System.out.println("UnSwaped list : "+al);

        System.out.print("Enter first index (to swap) : ");
        int a=sc.nextInt();
        System.out.print("Enter second index (to swap) : ");
        int b=sc.nextInt();
        if(0<=a && a<al.size() && 0<=b && b<al.size())
        {
            int elementA=al.get(a);
            int elementB=al.get(b);
            al.set(a,elementB);
            al.set(b,elementA);
            System.out.println("Swaped list : "+al);
        }
        else
        System.out.println("<<< Invalid index >>>");
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}