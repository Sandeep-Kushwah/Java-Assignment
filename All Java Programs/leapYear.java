import java.util.Scanner;
class leapYear
{
    public static void main(String args[])
    {
        int en,ct=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Leap year or not!");
        System.out.print("Enter year that you want to check :");
        en=sc.nextInt();
        //4 400 100
        // if(en>=2000)
        // {
        //     for(int i=2000; i<=en; i=i+4)
        //     {
        //         if(0==en%i)
        //         {
        //             System.out.println("Given year is Leap year.");
        //             ct=0;
        //             break;
        //         }
        //     }
        //     if(ct==1)
        //     {
        //         System.out.println("Given year is Not a Leap year.");
        //     }
        // }
        // else
        // {
        //      for(int i=2000; i>=en; i=i-4)
        //     {
        //         if(0==en%i)
        //         {
        //             System.out.println("Given year is Leap year.");
        //             ct=0;
        //             break;
        //         }
        //     }
        //     if(ct==1)
        //     {
        //         System.out.println("Given year is Not a Leap year.");
        //     }
        // }
        // System.out.println("\nI am Sandeep Kushwah.");
        // System.out.println("Roll num : 0873CS231107");
        if(0==en%4)
        System.out.println("This is a leap year.");
        else 
        System.out.println("This is not a leap year.");
    }
}