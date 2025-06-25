import java.util.ArrayList;
import java.util.Scanner;
public class AL48
{
    public static void main(String[] args) 
    {
        int swap;
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();

        num.add(20);
        num.add(50);
        num.add(10);
        num.add(40);
        num.add(30);
        
        System.out.println("Number List: " +num);
        System.out.print("Staring point of index : ");
        int start=sc.nextInt();
        System.out.print("Ending point of index : ");
        int end=sc.nextInt();

        for(int i=start; i<end; i++)
        {  
            try
            {
                System.out.print(num.get(i)+" ");
            }catch(Exception e)
            {
                System.out.println("\nEndex out of Bound.");
                break;
            }
        }
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
