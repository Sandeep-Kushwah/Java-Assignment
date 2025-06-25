import java.util.Scanner;
class PR22
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ")
        int en=sc.nextInt();
        en=en*10+2;
        int sum=0;
        System.out.print("Sum of : ");
        for(int i=12; i<=en; i=i+10)
        {
            System.out.print(i+" + ");
            sum=i+sum;
        }
        System.out.println("is : "+sum);
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}