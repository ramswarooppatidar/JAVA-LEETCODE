package maths.com;

import java.util.*;

public class NumberOfDay {
    public static int numberOfDay(int year, int month){
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> l = new ArrayList<>(Arrays.asList(1,3,5,7,8,10,12));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(4, 6, 9, 11));
        map.put(31, l);
        map.put(30, l2);
        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
            List<Integer> list = entry.getValue();
            if(list.contains(month)){
                return entry.getKey();
            }
        }
        if(year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)){
            return 29;
        }else{
            return 28;
        }
    }
    public static void main(String args[]){
       int day = numberOfDay(1992, 7);
        int day2 = numberOfDay(2000, 2);
        int day3 = numberOfDay(1900, 2);
        System.out.println("day "+day+" day2 "+day2+" day3 "+day3);
        /*
        Problem: Number of Days in a Month

Given two integers year and month, return the number of days in that month of that year.

Rules

Months with 31 days

1, 3, 5, 7, 8, 10, 12

Months with 30 days

4, 6, 9, 11

February

28 days normally

29 days in leap year

Leap Year Rule

A year is a leap year if:

(year % 400 == 0) OR (year % 4 == 0 AND year % 100 != 0)
Example 1

Input

year = 1992
month = 7

Output

31
Example 2

Input

year = 2000
month = 2

Output

29
Example 3

Input

year = 1900
month = 2

Output

28
         */
    }
}
