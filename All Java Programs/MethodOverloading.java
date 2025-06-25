class MethodOverloading
{
    public static void main(String args[])
    {
        test t=new test();
        t.show();
        t.show(2);
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
class test
{
    void show()
    {
        System.out.println("I am show method (Non-parameterized)");
        
    }
    void show(int i)
    {
        System.out.println("I am show method (parameterized)");
    }
}