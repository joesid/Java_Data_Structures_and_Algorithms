
public class DaysBetweenDates_ex {

    public static void main(String[] args)
    {

      DaysBetweenDates_ex lt = new DaysBetweenDates_ex();
      int[] result = lt.daysBetweenDates(2012, 2, 5, 2014, 2, 12);
      
      System.out.println(result[0]);
    }


    public int[] nextDay(int year, int month, int day)
    //Function that finds next day
    // Assuming every month has 30days
    {
        if (day < 30)
        {
            int[] results = {year, 1, 1};
            return results;
        }
        else 
        {
            if (month == 12 )
          {
            year =+1;
             int[] results = {year, 1, 1};
             return results;
          }
          else 
          {
            month =+1;
            int[] results = {year, month, 1};
            return results;
          }
        }

       
    }
    
    //Days Left
    public int daysleft(int month1, int month2, int day1)
    {
    int total_days;
    int monthleft = (month2 - month1) - 1;
    int dayleft = 30 - day1;
    total_days = dayleft + (monthleft * 30);
    return total_days;
    }

    
    public boolean dateIsBefore(int year1, int month1, int day1, int year2, int month2, int day2)
    {
      boolean isDayb4 = false;
      
      if (year1 < year2)
          isDayb4 = true;
      else if (year1 == year2)
        if (month1 < month2)
          isDayb4 = true;
        else if (month1 == month2)
          isDayb4 = day1 < day2;
      else isDayb4 = false;
      

      return isDayb4;
    }

    public int[] daysBetweenDates(int year1, int month1, int day1,int  year2, int month2, int day2)
    //Function that chects for the number of days between 2 different dates
    {
      int total_years = year2 - year1;
      int total_month = month2 - month1;
      int no_of_days = 0;
      int day_bet_yr = 0;


      String value = Boolean.toString(dateIsBefore(year1, month1, day1, year2, month2, day2));
      System.out.println(value);

      if (year2 == year1 && month2 == month1)
      // if the 2 years are the same and month is the same 
      {
        no_of_days = day2 - day1;
      }


      else if (year2 == year1 && month2 > month1)
      {
        //no_of_days = (total_month * 30) + (30 - day1) + (30 - day2);
        no_of_days = daysleft(month1, month2, day1) + (day2 - 1);
      }


      else if (year2 > year1)
      {
        //day_bet_yr = (int)Math.pow( 30 * 12, total_years);
        //no_of_days = (day2 - day1) + day_bet_yr;
        int day_yr = ((year2 - year1) - 1) * 30;
        int firstyr_days = ((12 - month1) * 30 )+ (30 - day1);
        int secondyr_days = (month2 * 30) - (30 - day2);
        no_of_days = day_yr + firstyr_days + secondyr_days;
      }

   /*   else if (year2 > year1 && month2 > month1)
      {
        day_bet_yr = (int)Math.pow(30*12, total_years);
        //no_of_days = (int)Math.pow(30 * 2, total_years) + (total_month * 30) + (30 - day1) + (30 - day2);  
        no_of_days = (30 *2)*total_years + (total_month * 30) + (30 - day1) + (30 - day2);
        }
      else if (year2 > year1 && month2 < month1)
      {
        day_bet_yr = (int)Math.pow(30 * 12, total_years);
        //no_of_days = 
      }

*/
    int[] No_of_day = {no_of_days};
        return No_of_day;
    }
  }
    
 

  