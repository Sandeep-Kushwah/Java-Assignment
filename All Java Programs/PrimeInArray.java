class PrimeInArray
{
    public static void main(String args[])
    {
        int arr[]=new int[]{2,3,5,6,8,11,25,34,23};
        int ct;
        for(int i=0; i<arr.length; i++)
        {   
            ct=1;
            for(int j=2; j<arr[i]; j++)
            {
                if(arr[i]==0 || arr[i]==2)
                break;
                if(0 == arr[i]%j)
                {   
                    ct=0;
                    break;
                }
            }
            if(ct==1)
            {
                System.out.println("This is prime : "+arr[i]);
            }
        }
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}