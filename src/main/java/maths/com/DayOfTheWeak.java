package maths.com;

public class DayOfTheWeak {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] week = {"Sunday", "Monday", "Tuesday",
                "Wednesday", "Thursday", "Friday", "Saturday"};

        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

        int totalDay = 0;
        for(int y = 1971; y<year; y++){
            totalDay += isLeapYear(y) ? 366 : 365;
        }

        for(int i =1 ; i<month; i++){
            totalDay += daysInMonth[i - 1];
            if(i == 2 && isLeapYear(year)){
                totalDay += 1;
            }
        }

        totalDay += day;
        return week[(totalDay + 4) % 7];
    }
    private boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static void main(String args[]){
        /*
        Given a date, return the corresponding day of the week for that date.

The input is given as three integers representing the day, month and year respectively.

Return the answer as one of the following values {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}.

Note: January 1, 1971 was a Friday.



Example 1:

Input: day = 31, month = 8, year = 2019
Output: "Saturday"
Example 2:

Input: day = 18, month = 7, year = 1999
Output: "Sunday"
Example 3:

Input: day = 15, month = 8, year = 1993
Output: "Sunday"

         */
    }
}
