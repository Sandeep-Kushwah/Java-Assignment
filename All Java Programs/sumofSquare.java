import java.util.*;
class sumofSquare
{
    public static void main(String args[])
    {
        int enter,sum=0; 
        System.out.print("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        enter=sc.nextInt();
        for(int i=1; i<=enter; i++)
        {
            sum=sum+(i*i);
        }
        System.out.println("Sum of square is : "+sum);

        System.out.println("I am Sandeep kushwah.");
        System.out.println("Roll num : 0873CS231107")
    }
}