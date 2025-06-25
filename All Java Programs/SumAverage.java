import java.util.Scanner;
class SumAverage
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int sum=0,average;
        System.out.print("Enter Ten numbers : ");
        for(int i=0; i<10; i++)
        a[i]=sc.nextInt();
        for(int i=0; i<10; i++)
        sum=sum+a[i];
        System.out.println("Sum of all the elements is : "+sum);
        average=sum/10;
        System.out.println("Average of all the elements is : "+average);

        System.out.println("I am Sandeep kushwah.");
        System.out.println("Roll num : 0873CS231107")
    }
}