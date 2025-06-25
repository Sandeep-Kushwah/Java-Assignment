import java.util.ArrayList;
class tableDetails
{
    public static void main(String args[])
    {
        ArrayList<item> list=new ArrayList<>();
        list.add(new item(1,"Laptop",69999.00));
        list.add(new item(2,"Mobile",39999.00));
        list.add(new item(3,"LED-TV",12000.00));
        list.add(new item(4,"Mouses",2500.00));
        list.add(new item(5,"Watchs",3700.00));

        for(item i:list)
        {
            System.out.println(i);
        }
        System.out.println("\nI am Sandeep Kushwah.");
        System.out.println("Roll No. : 0873CS231107");
    }
}
class item
{
    Integer serNo;
    String itmName;
    Double price;
    item(Integer serNo,String itmName, Double price)
    {
        this.serNo=serNo;
        this.itmName=itmName;
        this.price=price;
    }

    public String toString()
    {
        return "Item{ S.No : " + serNo + ", Name : " + itmName + ", Price : " + price + "}";
    }
}