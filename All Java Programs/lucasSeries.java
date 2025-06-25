class lucasSeries
{
    public static void main(String args[])
    {
        int a=1,b=2,c=3,sum,ans=6;//ans value is 6 bcz 1+2+3=6+sum
        System.out.println("Lucas Series is : 1,2,3,6,11,20....");
        System.out.println("Lucas Series will be :\n1\n2\n3");
        for(int i=1; i<=9; i++)
        {
            sum=a+b+c;
            System.out.println(+sum);
            ans=ans+sum;
            a=b;
            b=c;
            c=sum;
        }
        System.out.println("Sum of first ten lucas digit is : "+ans);       

        System.out.println("I am Sandeep kushwah.");
        System.out.println("Roll num : 0873CS231107") 
    }
}