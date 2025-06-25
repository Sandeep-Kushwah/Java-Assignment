import java.util.Scanner;
class SortDesending
{
    public static void main(String args[])//9,6,5
    {
        
        Scanner sc=new Scanner(System.in);

        int a[]=new int[10];
        int swap;
        System.out.println("Enter ten Numbers : ");

        for(int in=0; in<10; in++)
        a[in]=sc.nextInt();
        
        for(int i=0; i<10; i++)
        {
            for(int j=0; j<10; j++)
            {
                if(a[i]>a[j])                  
                {                            
                    swap=a[i];
                    a[i]=a[j];
                    a[j]=swap;

                }
            }
        }
        for(int j=0; j<10; j++)
        System.out.print(">"+a[j]);

        System.out.println("I am Sandeep kushwah.");
        System.out.println("Roll num : 0873CS231107")
    }
}