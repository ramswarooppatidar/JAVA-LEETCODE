package string4.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringMatching {
    public List<String> stringMatching(String[] words){
        Set<String> set = new HashSet<>();
        for(int i =0; i< words.length; i++){
            for(int j = 0; j<words.length; j++){
                if(i != j && words[j].contains(words[i])){
                    set.add(words[i]);
                    break;
                }
            }
        }
        return new ArrayList<>(set);
    }
    public static void main(String args[]){
        /*
        Given an array of string words, return all strings in words that are a substring of another word. You can return the answer in any order.

        Example 1:

        Input: words = ["mass","as","hero","superhero"]
        Output: ["as","hero"]
        Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
        ["hero","as"] is also a valid answer.
        Example 2:

        Input: words = ["leetcode","et","code"]
        Output: ["et","code"]
        Explanation: "et", "code" are substring of "leetcode".
        Example 3:

        Input: words = ["blue","green","bu"]
        Output: []
        Explanation: No string of words is substring of another string.

         */
    }
}
