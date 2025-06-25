import java.util.Scanner;
class PR30
{
    public static void main(String args[])
    {
        AreaCalculator ac=new AreaCalculator();
        System.out.print("Enter radius of the Circle : ");
        Scanner sc=new Scanner(System.in);
        float f=sc.nextFloat();
        ac.init(f);
        ac.calc();
      //  ac.disp();
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
class AreaCalculator
{
    float radius;
    void init(float radius)
    {
        this.radius=radius;
    }
    void calc()
    {
        float res=(float)(3.14*radius*radius);
        disp(res);
    }
    void disp(float res)
    {
        System.out.println("Area of the Circle is : "+res);
    }
}