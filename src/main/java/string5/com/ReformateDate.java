package string5.com;

import java.util.HashMap;
import java.util.Map;

public class ReformateDate {
    public String reformatDate(String date) {
        StringBuilder sb = new StringBuilder();
        String[] months = {
                "Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < months.length; i++){
            map.put(months[i], i + 1);
        }

        String parts[] = date.split(" ");
        sb.append(parts[2]);

        sb.append("-");
        int val = map.get(parts[1]);
        if(val <=9)sb.append("0");
        sb.append(val);

        sb.append("-");
        String day = parts[0];
        if(day.length()<=3){
            sb.append("0");
        }
        for(char ch : day.toCharArray()){
            if(ch >= '0' && ch <= '9'){
                sb.append(String.valueOf(ch));
            }
        }
        return sb.toString();
    }
    /*

    Given a date string in the form Day Month Year, where:

        Day is in the set {"1st", "2nd", "3rd", "4th", ..., "30th", "31st"}.
        Month is in the set {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}.
        Year is in the range [1900, 2100].
        Convert the date string to the format YYYY-MM-DD, where:

        YYYY denotes the 4 digit year.
        MM denotes the 2 digit month.
        DD denotes the 2 digit day.


        Example 1:

        Input: date = "20th Oct 2052"
        Output: "2052-10-20"
        Example 2:

        Input: date = "6th Jun 1933"
        Output: "1933-06-06"

     */
}
