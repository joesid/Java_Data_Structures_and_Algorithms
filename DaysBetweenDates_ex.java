
public class DaysBetweenDates_ex {

    public static void main(String[] args)
    {

      DaysBetweenDates_ex lt = new DaysBetweenDates_ex();
      int[] result = lt.daysBetweenDates(2012, 9, 30, 2012, 10, 30);
      
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


    public int[] daysBetweenDates(int year1, int month1, int day1,int  year2, int month2, int day2)
    //Function that chects for the number of days between 2 different dates
    {
      int total_years = year2 - year1;
      int total_month = month2 - month1;
      int no_of_days = 0;
      int day_bet_yr = 0;

      if (year2 == year1 && month2 == month1)
      // if the 2 years are the same and month is the same 
      {
        no_of_days = day2 - day1;
      }
      else if (year2 == year1 && month2 > month1)
      {
        no_of_days = (total_month * 30) + (30 - day1) + (30 - day2);
      }
      else if (year2 > year1 && month2 == month1)
      {
        day_bet_yr = (int)Math.pow( 30 * 12, total_years);
        no_of_days = (day2 - day1) + day_bet_yr;
      }
      else if (year2 > year1 && month2 > month1)
      {
        day_bet_yr = (int)Math.pow(30*12, total_years);
        no_of_days = (int)Math.pow(30 * 2, total_years) + (total_month * 30) + (30 - day1) + (30 - day2);  
        }


    int[] No_of_day = {no_of_days};
        return No_of_day;
    }
  }
    
 

  