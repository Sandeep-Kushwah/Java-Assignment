import java.util.Scanner;

class Days
{
    public static void main (String args[])
    {
        int days, years, months, weeks, remDays;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of days: ");
        days=sc.nextInt();
        years=days/365;
        System.out.println("Years: "+years);
        years=days%365;//remaining days store in years
        months=years/30;
        System.out.println("Months: "+months);
        months=years%30;//remaining days store in months
        weeks=months/7;
        System.out.println("Weeks: "+weeks);
        weeks=months%7;//remaining days store in weeks
        remDays=weeks;//remDays is remaining days
        System.out.println("Days: "+remDays);
        System.out.println("\nI am Sandeep kushwah");
        System.out.println("Roll no.: 0873CS231107");
    }
}