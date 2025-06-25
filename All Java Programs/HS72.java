import java.util.HashSet;
public class HS72
{
    public static void main(String[] args)
    {
        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        String[] colorArray = colors.toArray(new String[0]);

        System.out.println("Elements in the array:");
        for (String color : colorArray) 
        {
            System.out.println(color);
        }
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
