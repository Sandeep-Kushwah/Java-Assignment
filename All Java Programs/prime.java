import java.util.Scanner;
class prime
{
    public static void main(String args[])
    {
        int input,count=1;
        Scanner scankaro=new Scanner(System.in);
        System.out.print("Enter number : ");
        input=scankaro.nextInt();
        if(input==2 || input==1)
        System.out.println("Given number is prime.");
        else
        {
            for(int i=2; i<input; i++)
            {
                if(0==input%i)
                {
                    System.out.println("Given number is not prime.");
                    count=0;
                    break;
                }
            }
            if(count==1)
            System.out.println("Given number is prime.");
        }
        System.out.println("I am Sandeep kushwah.");
        System.out.println("Roll num : 0873CS231107");
    }
}