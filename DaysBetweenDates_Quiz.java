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

int[] nextDay(int year, int month, int day)
//Function moves date to the next day
{
   
    int day_c = daysInMonth_ly(year, month);
    
    if (day < day_c)
    {
     day +=1;
    }
    else if ((day == day_c) && (month < 12 ))
    {
    day = 1;
    month +=1;
    }
    else if ((day == 31) && (month == 12))
    {
    day = 1;
    month =1;
    year +=1;
    }

    int[] date = {year, month, day};

    return date;
}

int daysleft(int year, int month,int day)
{
    int dayleft = daysInMonth_ly(year, month);
     return dayleft;
}

int daysBtwnMonth(int year, int month1, int month2)
// finds the number of days within two seperate months in the same year
{
  int total_days = 0;
  
  for(int i = month1; i < month2; i++)
  {
    if ((isLeapYear(year)) && (i == 2))
    {
      total_days +=29;
    }
    else
    {
      total_days += daysInMonth(i);
    }
  }
  return total_days;
}

int daysBtwnYear(int year1,int year2)
//Calculate the number of days between two years
{
  int total_days = 0;
  int days = 0;
  year1 +=1;

  for(int i = year1; i < year2; i++)
  {
    if (isLeapYear(i))
    {
      days +=366;
    }
    else{
      days+=365;
    }

  }
total_days +=days;
return total_days;

}

int dayRemYear(int month,int year)
//finds the number of days remaining in a year after a given month
{
  int t_days =0;
  int day = 0;
  month+=1;
  if (month <= 12)
  {
    for(int i=month; i<13; i++)
    {
      if (isLeapYear(year) && (i == 2))
      {
         day = 29;
      }
      else if (i == 2)
      {
        day = 28;
      }
      else if ((i == 4) || (i==6)||(i==9)||(i==11))
      {
        day = 30;
      }
      else 
      {
        day = 31;
      }
      t_days +=day;
    }
   
  }

  return t_days;
}

int sec_yr(int year, int month){
  //finds the number of days before the month of the 2nd date in it's year 
  int day = 0;
  int t_day = 0;
  
  for (int i = 1; i < month; i++){

    day = daysInMonth_ly(year, i);
    t_day +=day;
  }

  return t_day;
}

int dayBetweenDate(int year2, int month2, int day2, int year1, int month1, int day1){
  int day_num = 0;
  int day_month1 = daysInMonth_ly(year1, month1);
  int day_month2 = daysInMonth_ly(year2, month2);
  int day_years = daysBtwnYear(year1, year2);
  
  if ((year2 == year1) && (month2 == month1)){
    //if dates have the same year and month
    day_num = day2 - day1;
  }
  else if ((year2 == year1) && (month2 > month1)){
    //if dates have the same year, but different month
    day_num = daysBtwnMonth(year1,month2, month1) + (day_month2 - (day_month2 - day2));
  }
  else if ((year2 > year1)){
    //if dates have different years
    day_num = day_years + (day_month1 - day1) + dayRemYear(month1, year1) + sec_yr(year2, month2) + (day_month2 - (day_month2 - day2));
  }


  return day_num;
}

}