import java.util.ArrayList;
class AL52 
{
    public static void main(String[] args) 
    {        
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Cherry");
        
        ArrayList<String> clonedList = (ArrayList<String>) originalList.clone();

        System.out.println("Original List: " + originalList);
        System.out.println("Cloned List: " + clonedList);
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
