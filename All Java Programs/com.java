class com
{
    public static void main(String args[])
    {
        // String en="www.google.in";
        // if(en.endsWith(".com"))
        // System.out.println("It's a commercial web.");
        // else if(en.endsWith(".in"))
        // System.out.println("It's a indian web.");
        // int sum=0;
        // int a[]={1,2,3,4,5,5,4};
        // for(int i: a)
        // {
        //     sum=i+sum;
        //     System.out.println(sum);

        // }
        
        // int a[][]={{1,2},{3,4}};
        // int b[][]={{1,2},{3,4}};
        // for(int i=0; i<2; i++)
        // {
        //     for (int j=0; j<2; j++)
        //     {
        //         System.out.print(" "+(a[i][j]+b[i][j]));
        //     }
        //     System.out.println();
        // }

        // a=10;
        // b=20;
        // a=a+b;=30
        // b=a-b;10
        // a=a-b;20

        int a[]={1,2,3,4,5,6,7,8,9,10};
        for(int i=0; i<a.length/2; i++)
        {
            int j=a.length-1-i;
            a[i]=a[i]+a[j];
            a[j]=a[i]-a[j];
            a[i]=a[i]-a[j];
        }
        for(int k:a)
        System.out.println(k);
    }
}