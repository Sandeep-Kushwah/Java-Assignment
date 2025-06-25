class PR29
{
    public static void main(String args[])
    {
        int a[][]=new int[][]{{1,2,3},{4,5},{6,7,8}};
        int row=a.length,col=0;

        //This will check maximum no. of coloumns.
        for(int c[] : a)
        {
            if(c.length>col)
            col=c.length;
        }
        int b[][]=new int[col][row];

        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                b[j][i]=a[i][j];
            }
        }

        for(int k[] : b )
        {
            for(int l : k)
            {
                System.out.print(l+" ");
            }
            System.out.println();
        }
        System.out.println("\nI am Sandeep kushwah.");
        System.out.println("Roll no. : 0873CS231107");
    }
}