class CallConstructor
{
    /*Yes, We can call a constructor from a another 
    constructor 
    of same class.*/
    public static void main(String args[])
    {
        test t=new test(5);
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
class test
{
    test()
    {
        System.out.println("I am non-parameterized constructor.");
    }
    test(int i)
    {
        this(); //Must be call in the first line of the constructor.
        System.out.println("I am parameterized constructor.");
    }
    System.out.println("\nI am Sandeep Kushwah.");
    System.out.println("Roll No. : 0873CS231107");
}