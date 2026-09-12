package string6.easy;

import java.util.ArrayList;
import java.util.List;

public class CountGoodString {
    public int countGoodSubstrings(String s){
        int count =0;
        for(int i =0; i<s.length()- 2; i++){
            int val = s.charAt(i) - 'a';
            int val2 = s.charAt(i + 1) - 'a';
            int val3 = s.charAt(i + 2) - 'a';
            if(val != val2 && val2 != val3 && val != val3){
                count++;
            }
        }
        return count;
    }


    public int countGoodSubstrings2(String s) {
        List<String> list = new ArrayList<>();
        int count=0;
        for(int i =0; i<s.length() - 2; i++){
            StringBuilder sb = new StringBuilder();
            for(int j =0; j<3; j++){
                sb.append(s.charAt(i+j));
            }
            list.add(sb.toString());
        }
        System.out.println(list);
        for(String str : list){
            int val = str.charAt(0) - 'a';
            int val2 = str.charAt(1) - 'a';
            int val3 = str.charAt(2) - 'a';
            if(val != val2 && val2 != val3 && val != val3){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        /*
        A string is good if there are no repeated characters.

        Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.

        Note that if there are multiple occurrences of the same substring, every occurrence should be counted.

        A substring is a contiguous sequence of characters in a string.

        Example 1:

        Input: s = "xyzzaz"
        Output: 1
        Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz".
        The only good substring of length 3 is "xyz".
        Example 2:

        Input: s = "aababcabc"
        Output: 4
        Explanation: There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
        The good substrings are "abc", "bca", "cab", and "abc".

         */
    }
}
