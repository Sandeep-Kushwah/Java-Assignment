import java.util.HashSet;
class HS71 
{
    public static void main(String[] args) 
    {
        HashSet<String> originalSet = new HashSet<>();
        originalSet.add("Red");
        originalSet.add("Green");
        originalSet.add("Blue");

        HashSet<String> clonedSet = (HashSet<String>) originalSet.clone();

        System.out.println("Original HashSet: " + originalSet);
        System.out.println("Cloned HashSet: " + clonedSet);
    }
    System.out.println("\nI am Sandeep Kushwah.");
    System.out.println("Roll No. : 0873CS231107");
}
