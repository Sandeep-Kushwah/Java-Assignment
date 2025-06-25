import java.util.Scanner;
class PR31
{   
    float x,y,r;
    char ope;
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number : ");
        x=sc.nextFloat();
        System.out.print("Enter Second number : ");
        y=sc.nextFloat();
        System.out.print("What do you want +,* : ");
        ope=sc.next().charAt(0);
        switch(ope)
        {
            case '+' : add(); break;
            case '*' : multiply(); break;
        }
    }
    void add()
    {
        r=x+y;
    }
    void multiply()
    {
        r=x*y;
    }
    void display()
    {
        System.out.println("Answer is : "+r);
    }
    public static void main (String args[])
    {
        PR31 m=new PR31();
        m.init();
        m.display();
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
