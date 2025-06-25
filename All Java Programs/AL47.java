import java.util.ArrayList;

public class AL47
{
    public static void main(String[] args) 
    {
        int swap;
        ArrayList<Integer> num = new ArrayList<>();

        num.add(20);
        num.add(50);
        num.add(10);
        num.add(40);
        num.add(30);
        num.add(20);
        num.add(50);
        System.out.println("Simple Number List: " +num);
        
        for(int i=0; i<num.size()/2; i++)
        {  
            swap=num.get(i); 
            num.set(i,num.get(num.size()-i-1));
            num.set(num.size()-i-1,swap);
        }
        System.out.println("Reverse Number List : "+num);
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
