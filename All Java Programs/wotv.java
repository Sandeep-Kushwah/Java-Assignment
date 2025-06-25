import java.util.Scanner;
class wotv//Without third variable
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;//Suppose a = 10 b = 20
        System.out.print("Enter number a: ");
        a=sc.nextInt();
        System.out.print("Enter number b: ");
        b=sc.nextInt();
        a=a+b; // a = 30 b = 20
        b=a-b; // b = 10 ; a = 30
        a=a-b;// b = 10 a = 20 Here value have been changed.
        System.out.println("\nvalues have been changed without third variable.");
        System.out.println("value of a is: "+a);
        System.out.println("value of bis: "+b);
        System.out.println("\nI am Sandeep kushwah");
        System.out.println("Roll no.: 0873CS231107");
    }
}