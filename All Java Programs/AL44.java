import java.util.ArrayList;

public class AL44
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
        System.out.println("Unsorted Number List: " + num);
        
        for(int i=0; i<num.size(); i++)
        {
            for(int j=0; j<num.size(); j++)
            {
                if(num.get(i)<num.get(j))                  
                {                            
                    swap=num.get(i); 
                    num.set(i,num.get(j));
                    num.set(j,swap);
                    //here if we use add method then error will occur.
                }
            }
        }
        System.out.println("Sorted Number List : "+num);
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
