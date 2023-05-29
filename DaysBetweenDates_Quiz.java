public class DaysBetweenDates_Quiz {

boolean isLeapYear(int year)
//Checks if year is a leap year 
{
    if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
    return true;
    else
    return false;
}


int daysInMonth(int month)
//Returns days in a Month for a standard month
{
    int day = 0;

    if(month == 2)
    day = 28;

    else if(month == 4 || month == 6 || month == 9 || month == 11)
    day = 30;

    else
      day = 31;
    return day;
}


int daysInMonth_ly(int year, int month)
// Function to be used, if year is a Leapyear 
{
    if ((month == 2) && (isLeapYear(year)))
    {
      return 29;
    }
    else 
    {
        return daysInMonth(month);
    }
}
}