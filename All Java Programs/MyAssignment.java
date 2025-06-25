import java.util.ArrayList;
import java.util.Scanner;
class MyAssignment
{
    
    static ArrayList<Student> li=new ArrayList<>();
    static boolean rollCheck=false;
    static int ct=0;
    
    public static void main(String args[])
    {
        int choice;
        String rollNo;
        StringBuffer sbRoll,sbName,sbCourse;
        float marks;

        Scanner sc=new Scanner(System.in);
        
        while(true)
        {
            System.out.println("\n<<< STUDENT MANAGMENT SYSTEM >>>");
            System.out.println("1. Add Student");
            System.out.println("2. View all Student");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("\nEnter your choice : ");
            choice=sc.nextInt();
            sc.nextLine();

            switch(choice)
            {
                case 1 : 
                {
                    //To add students in record.
                    try{
                    System.out.print("\nEnter Student Roll No. : ");
                    sbRoll = new StringBuffer(sc.nextLine());
                    if(methodRoll(sbRoll.toString()))
                    {
                        System.out.println("\n<<< !!! already exist. !!! >>>\n");
                        break;
                    }
                    System.out.print("Enter Student Name : ");
                    sbName = new StringBuffer(sc.nextLine());
                    System.out.print("Enter Student Course : ");
                    sbCourse = new StringBuffer(sc.nextLine());
                    System.out.print("Enter Student Marks : ");
                    marks=sc.nextFloat();
                    li.add(new Student(sbRoll.toString(),sbName.toString(),sbCourse.toString(),marks));
                    }catch(Exception e)
                    {System.out.println("<<< !!! Invalid Input Exception !!! >>>");
                     sc.nextLine(); 
                    }
                } break;

                case 2 : 
                {
                    //To view all students details.
                    System.out.println();
                    if(li.isEmpty())
                    {
                        System.out.println("\n<<< !!! NO RECORD FOUND !!! >>>\n");
                        break;
                    }
                    for(Student stu:li)
                    {   
                        System.out.println(stu);
                    }
                    System.out.println();
                } break;

                case 3 : 
                {
                    //To search student is present in list or not.
                    System.out.print("\nEnter Student Roll NO. : ");
                    rollNo=sc.nextLine();
                    
                    if(methodRoll(rollNo))
                    {
                        System.out.println("\n<<< Student is present of Roll NO. : "+rollNo+" >>>\n");
                    }
                    else    
                    {
                        System.out.println("\n<<< !!! Student not present !!! >>>\n");
                    }
                } break;
                
                case 4 : 
                {
                    //To update student details.
                    System.out.print("Enter roll No. : ");
                    rollNo=sc.nextLine();
                    if(methodRoll(rollNo))
                    {
                        try{
                            System.out.print("Enter Updated Name : ");
                            sbName = new StringBuffer(sc.nextLine());
                            System.out.print("Enter Updated Course : ");
                            sbCourse = new StringBuffer(sc.nextLine());
                            System.out.print("Enter Updated Marks : ");
                            marks = sc.nextFloat();
                            li.set(objectIndex(rollNo), new Student(rollNo.toString(),sbName.toString(),sbCourse.toString(),marks));
                            System.out.println("\n<<< Student Details Updated. >>>\n");
                        }catch(Exception e)
                        {
                            System.out.println("<<< !!! Invalid Input Exception !!! >>>");
                            sc.nextLine();
                        }
                    }
                    else
                    System.out.println("\n<<< !!! Student not present !!!. >>>\n");
                } break;

                case 5 : 
                {
                    //To Delete a student record.
                    System.out.print("Enter roll No. : ");
                    rollNo=sc.nextLine();
                    if(methodRoll(rollNo))
                    {
                        li.remove(objectIndex(rollNo));
                        System.out.println("\n<<< Student of roll no. "+rollNo+" removed successfully. >>>\n");
                    }
                    else
                    System.out.println("\n<<< !!! Student not present !!! >>> \n");
                }break;
                case 6:
                {
                    System.out.println("\n<<< !!! Exiting Student Management System. Goodbye !!! >>>\n\n");
                    System.exit(0);
                }
            }
        }
    }
    static boolean methodRoll(String rollNo)
    {
        //TO check this roll no. is present or not.
        for(Student s:li)
        {
            if(s.returnRoll().equals(rollNo))
            {
                return true;
            }
        }
        return false;
    }
    static int objectIndex(String rollNo)
    {   
        for(int i=0; i<li.size(); i++)
        {
            if(li.get(i).returnRoll().equals(rollNo))
            return i;
        }
        return -1;
    }
}
class Student
{
    String rollNo;
    String name;
    String course;
    float marks;
  
    public String returnRoll()
    {
        return this.rollNo;
    }
    Student(String rollNo,String name,String course,float marks)
    {
        this.rollNo=rollNo;
        this.name=name;
        this.course=course;
        this.marks=marks;
        System.out.println("\n<<< Student Details Submitted Successfully. >>>\n");
    }

    //To override Object Method
    public String toString()
    {
        return "Roll No. : "+rollNo+" || Name : "+name+" || Course "+course+" || Marks : "+marks;
    }
}