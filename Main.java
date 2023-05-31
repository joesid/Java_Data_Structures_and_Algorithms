import java.util.Scanner;

public class Main {

    public static void main(String[] arg)
    {   
       
       dayBtwn();

        System.out.println("This is currently the entry point for this code");

    }


    static void dayBtwn(){

   


        DaysBetweenDates_Quiz quiz1 = new DaysBetweenDates_Quiz();
        boolean lp = quiz1.isLeapYear(2012);


        String day_val = Boolean.toString(lp);
        System.out.println(day_val);
    
        int monthval = quiz1.daysInMonth(2);

        int[] nextDay = quiz1.nextDay(2012, 5, 31);

        int day_month = quiz1.daysBtwnMonth(2020,1,4);

        int day_year = quiz1.daysBtwnYear(2012, 2017);

        int month_year = quiz1.dayRemYear(1, 2020);

        int sec = quiz1.sec_yr(2020, 3);

        int nodays = quiz1.dayBetweenDate(2012, 6, 30, 2011, 6, 30);

        System.out.println("the dayBetweenDate value is: " + nodays);

        System.out.println("The value of the days in the second year before the month date is: " + sec);


        System.out.println("The Day remainining in the year " + month_year);

        System.out.println("The days between the year " + day_year);

        System.out.println("The days between month is " + day_month);

        System.out.println("print next day out " + nextDay[0] + " " + nextDay[1] + " " + nextDay[2]);

        System.out.println("The value of month val is: " + monthval);
    }
}


