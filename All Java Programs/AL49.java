import java.util.ArrayList;
class AL49
{
    public static void main(String args[])
    {
        ArrayList<Object> a=new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(50);
        a.add(10);
        a.add(40);

        ArrayList<Object> b=new ArrayList<>();
        b.add(10);
        b.add(30);
        b.add(50);
        b.add(90);
        b.add(40);
        int small=(a.size()<b.size())? a.size() : b.size();
        for(int i=0; i<small; i++)
        {
            if(a.get(i)==b.get(i))
            System.out.println(a.get(i)+" Equal "+b.get(i));
            else
            System.out.println(a.get(i)+" Not Equal "+b.get(i));
        }
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}