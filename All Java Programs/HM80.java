import java.util.HashMap;
class HM80
{
    public static void main(String args[])
    {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(10,"Rohan");
        hm.put(20,"Ram");
        hm.put(30,"Rahul");

        if(hm.isEmpty())
        System.out.println("HashMap is empty.");
        else
        System.out.println("HashMap has elements : "+hm);
    }
    System.out.println("\nI am Sandeep Kushwah.");
    System.out.println("Roll No. : 0873CS231107");
}