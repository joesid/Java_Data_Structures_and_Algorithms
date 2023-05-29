
public class Main {

    public static void main(String[] arg)
    {   
        DaysBetweenDates_Quiz quiz1 = new DaysBetweenDates_Quiz();
        boolean lp = quiz1.isLeapYear(2012);


        String day_val = Boolean.toString(lp);
        System.out.println(day_val);

        int monthval = quiz1.daysInMonth(2);

        System.out.println("The value of month val is: " + monthval);

        System.out.println("This is currently the entry point for this code");
    }
}