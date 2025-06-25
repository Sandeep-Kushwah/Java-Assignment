import java.util.ArrayList;
class AL51
{
    public static void main(String args[])
    {
        ArrayList<Object> al1=new ArrayList<>();
        ArrayList<Object> al2=new ArrayList<>();

        al1.add(78);
        al1.add(34.5);
        al1.add("Ram");
        System.out.println("First list : "+al1);

        al2.add("Sita");
        al2.add(23.05f);
        al2.add(85);
        System.out.println("Second list : "+al2);

        ArrayList<Object> Merged=new ArrayList<>();
        Merged.addAll(al1);
        Merged.addAll(al2);
        System.out.println("Merged list : "+Merged);
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}