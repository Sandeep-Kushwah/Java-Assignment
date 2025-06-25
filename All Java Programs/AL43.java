import java.util.ArrayList;
import java.util.Scanner;

public class AL43
{
    public static void main(String[] args) 
    {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Mango");
        System.out.println("Fruit List: " + fruits);

        Scanner scanner = new Scanner(System.in);
        System.out.print("What do you want to search : ");
        String srh=scanner.nextLine();
        int not=1;
        for(int i=0; i<fruits.size(); i++)
        {
            if((fruits.get(i)).equals(srh))
            {
                System.out.println("\""+srh+"\" is present at index : "+i);
                not=0;
            }
        }
        if(not==1)
        System.out.println("\""+srh+"\" is not presrnt.");
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
