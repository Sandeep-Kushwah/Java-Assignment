import java.util.ArrayList;

public class AL45
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(20);
        num1.add(50);
        num1.add(10);
        num1.add(40);
        num1.add(30);

        ArrayList<Integer> num2 = new ArrayList<>(num1);
        ArrayList<Integer> num3 = new ArrayList<>();
        num3.addAll(num1);

        System.out.println("Num1 List : "+num1);
        System.out.println("Num2 List : "+num2);
        System.out.println("Num3 List : "+num3);
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
