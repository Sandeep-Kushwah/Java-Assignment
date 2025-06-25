import java.util.*;
class maleFemale
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int mf,age;//mf for male and female
        System.out.println("Male:1---Female:2");
        System.out.print("Are you Male or Female : ");
        mf=sc.nextInt();
        System.out.print("Enter your age : ");
        age=sc.nextInt();
        if(mf==1)
        {
            if(age>=21)
            System.out.println("You are eligible for marriage.");
            else 
            System.out.println("You are not eligible for marriage.");
        }
        else if (mf==2)
        {
            if(age>=18)
            System.out.println("You are eligible for marriage.");
            else 
            System.out.println("You are not eligible for marriage.");
        }
        else
        {
            System.out.println("Wrong entries. !!!");
        }
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll num : 0873CS231107");
    }
}