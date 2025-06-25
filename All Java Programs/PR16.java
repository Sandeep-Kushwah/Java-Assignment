import java.util.Scanner;
class PR16
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first no. : ");
        int a=sc.nextInt();
        System.out.print("Enter second no. : ");
        int b=sc.nextInt();
        System.out.print("Enter third no. : ");
        int c=sc.nextInt();
        if(a>b)
        {
            if(a>c)
            System.out.println("First no. is greatest : "+a);
            else
            System.out.println("Third no. is greatest : "+c);   
        }
        else
        {
            if(b>c)
            System.out.println("Second no. is greatest : "+b);
            else
            System.out.println("Third no. is greatest : "+c);
        }
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}