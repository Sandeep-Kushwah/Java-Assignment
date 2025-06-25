import java.util.Scanner;
class primeBetween
{
    public static void main(String args[])
    {
        int instart,inend,count=1;
        Scanner scankaro=new Scanner(System.in);
        System.out.print("Enter Starting number : ");
        instart=scankaro.nextInt();
        System.out.print("Enter Ending number : ");
        inend=scankaro.nextInt();
        while(instart!=inend)
        {
            for(int i=2; i<instart; i++)
            {
                if(0==instart%i)
                {
                    count=0;
                    break;
                }
            }
            if(count==1)
            System.out.println(+instart );
            count=1;
            instart++;
        }
        System.out.println("I am Sandeep kushwah.");
        System.out.println("Roll num : 0873CS231107")
    }
}
