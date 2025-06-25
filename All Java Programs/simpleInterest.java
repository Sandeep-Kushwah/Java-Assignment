import java.util.Scanner;
class simpleInterest
{
    public static void main(String args[])
    {
        Scanner scankaro=new Scanner(System.in);
        int pri,time;
        float rate,itr;
        System.out.print("Enter principal amount : ");
        pri=scankaro.nextInt(); 
        System.out.print("Enter rate amount : ");
        rate=scankaro.nextFloat(); 
        System.out.print("Enter time in year : ");
        time=scankaro.nextInt();  
        itr=(pri*rate*time)/100 ;
        System.out.println("Simple Interest will be : "+itr);
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll num : 0873CS231107");
    }
}