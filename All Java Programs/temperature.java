import java.util.Scanner;
class temperature
{
    public static void main(String args[])
    {
        Scanner scn=new Scanner(System.in);
        float ent,ans;
        System.out.print("Enter value of Fahrenheit : ");
        ent=scn.nextFloat();
        ans=5*(ent-32)/9;
        System.out.println("Value of Temprature in Celsius : "+ans);
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll num : 0873CS231107");
    }
}