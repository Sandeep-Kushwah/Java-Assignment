class Row5Ele17
{
    public static void main(String args[])
    {
        int sum=0;
        int [][]a={
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11},
                    {12,13,14},
                    {15,16,17}
                  };
        for(int i=0; i<a.length; i++)
        {
            //a.length for j will throw error (ArrayIndexOutOfBoundException)
            for(int j=0; j<a[i].length; j++)  
            {
                System.out.printf(a[i][j]+"  ");
                sum+=a[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of all the 17 elements : "+sum);
        System.out.println("\nI am Sandeep kushwah.");
        System.out.println("Roll no. : 0873CS231107");
    }
}
