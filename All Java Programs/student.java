import java.util.Scanner;
class student
{
    public static void main (String args[])
    {
        float s1,s2,s3, s4, s5, sum,per;
        String grd;
        Scanner scan=new Scanner(System.in);//here Scanner is a class
        System.out.print("Enter Hindi subject mark: ");
        s1=scan.nextFloat();
        System.out.print("Enter English subject mark: ");
        s2=scan.nextFloat();
        System.out.print("Enter Maths subject mark: ");
        s3=scan.nextFloat();
        System.out.print("Enter Physics subject mark: ");
        s4=scan.nextFloat();
        System.out.print("Enter Chemistry subject mark: ");
        s5=scan.nextFloat();
        sum=s1+s2+s3+s4+s5;
        per=sum/5;
        if(per>=90)
        grd ="A";
        else if(per>=80)
        grd ="B";
        else if (per>=70)
        grd ="C";
        else if (per>=40)
        grd ="D";
        else
        grd="Try your best next time.";
        System.out.println("Your percentage is: "+per);
        System.out.println("Your grade is: "+grd);
        System.out.println("\nI am Sandeep kushwah");
        System.out.println("Roll num.: 0873CS231107");
    }
}