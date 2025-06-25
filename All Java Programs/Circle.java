import java.util.Scanner;
class Circle
{
    public static void main (String args[])
    {
        float radius, area, Crf;//Crf for circumference
        Scanner scan=new Scanner(System.in);//here Scanner is a class
        System.out.print("Enter the radius of circle: ");
        radius=scan.nextFloat();
        area=(float)3.14* radius*radius;
        Crf=(float) (2*3.14*radius);
        System.out.println("Area of Circle is: "+area);
        System.out.println("Circumference of Circle is: "+Crf);
        System.out.println("\nI am Sandeep kushwah");
        System.out.println("Roll num. 0873CS231107");
    }
}