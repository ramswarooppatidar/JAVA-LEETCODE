package maths.com;

public class DayBetweenDates {
    public static int dayBetweenDate(String date1, String date2){
        return Math.abs(getDay(date1) - getDay(date2));
    }
    private static int getDay(String date){
        String part[] = date.split("-");
        int year = Integer.parseInt(part[0]);
        int month = Integer.parseInt(part[1]);
        int day = Integer.parseInt(part[2]);

        int totalDay = 0;
        for(int y = 1971; y<year; y++){
            totalDay += (isLeapYear(y) ? 366 : 365);
        }

        int dayInMonth[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        for(int m = 1; m < month; m++){
            totalDay += dayInMonth[m - 1];
            if(m == 2 && isLeapYear(year)){
                totalDay += 1;
            }
        }
        totalDay += day;
        return totalDay;
    }
    private static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
    public static void main(String args[]){
        System.out.println(dayBetweenDate("2019-06-29", "2019-06-30"));
        System.out.println(dayBetweenDate("2020-01-15", "2019-12-31"));
        System.out.println(dayBetweenDate("1994-03-16", "2026-03-20"));
        /*
        Write a program to count the number of days between two dates.

        The two dates are given as strings, their format is YYYY-MM-DD as shown in the examples.

        Example 1:

        Input: date1 = "2019-06-29", date2 = "2019-06-30"
        Output: 1
        Example 2:

        Input: date1 = "2020-01-15", date2 = "2019-12-31"
        Output: 15

        Constraints:

        The given dates are valid dates between the years
        ******************1971 and 2100.*******************
         */
    }
}
