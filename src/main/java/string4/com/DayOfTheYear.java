package string4.com;

import java.util.*;

public class DayOfTheYear {
    public int dayOfYear(String date) {
        int day = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 31);
        map.put(2, 28);
        map.put(3, 31);
        map.put(4, 30);
        map.put(5, 31);
        map.put(6, 30);
        map.put(7, 31);
        map.put(8, 31);
        map.put(9, 30);
        map.put(10, 31);
        map.put(11, 30);
        map.put(12, 31);

        String[] str = date.split("-");

        int year = Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);
        int currentDay = Integer.parseInt(str[2]);

        // Leap year check
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            map.put(2, 29);
        }

        for (int i = 1; i < month; i++) {
            day += map.get(i);
        }

        day += currentDay;

        return day;
    }
    public static void main(String arg[]){
        /*
        Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.



Example 1:

Input: date = "2019-01-09"
Output: 9
Explanation: Given date is the 9th day of the year in 2019.
Example 2:

Input: date = "2019-02-10"
Output: 41

         */
    }
}
