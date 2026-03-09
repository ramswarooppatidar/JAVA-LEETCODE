package string4.com;

import java.util.*;

public class CountCharacters {
    public int countCharacters(String[] words, String chars) {
        int result = 0;
        // HashMap<Character, Integer> map = new HashMap<>();
        //     for (char ch : chars.toCharArray()) {
        //         map.put(ch, map.getOrDefault(ch, 0) + 1);
        //     }


        for(String word : words){
            HashMap<Character, Integer> map = new HashMap<>();
            for (char ch : chars.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            boolean isCompleted = true;
            for(char ch : word.toCharArray()){
                if(!map.containsKey(ch) || map.get(ch) == 0){
                    isCompleted = false;
                    break;
                }
                map.put(ch, map.get(ch) - 1);
            }
            if(isCompleted){
                result += word.length();
            }
        }
        return result;
    }
    public static void main(String args[]){
        /*
        You are given an array of strings words and a string chars.

A string is good if it can be formed by characters from chars (each character can only be used once for each word in words).

Return the sum of lengths of all good strings in words.



Example 1:

Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
Example 2:

Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10
Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
         */
    }
}
