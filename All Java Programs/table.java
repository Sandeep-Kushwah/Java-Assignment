import java.util.Scanner;
class table
{
    public static void main(String args[])
    {
        int ent;
        Scanner scankaro=new Scanner(System.in);
        System.out.print("Enter number that you want to table : ");
        ent=scankaro.nextInt();
        for(int i=1; i<=10; i++)
        {
            System.out.println(i*ent);
        }

        System.out.println("I am Sandeep kushwah.");
        System.out.println("Roll num : 0873CS231107")
    }
}