package string5.easy;

public class CountComsistSTring {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean index[] = new boolean[26];

        for(int i =0;i<allowed.length(); i++){
            char ch = allowed.charAt(i);
            index[ch - 'a'] = true;
        }
        int count =0;

        for(int i =0;i<words.length; i++){
            String word = words[i];

            boolean flag = true;
            for(char ch : word.toCharArray()){
                if(!index[ch -'a']){
                    //allowed.contains(...) har character par string search karta hai. boolean[] use karoge to lookup O(1) ho jayega:
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }
        return count;
    }

    // public int countConsistentStrings(String allowed, String[] words) {
    //     int count =0;
    //     for(int i =0;i<words.length; i++){
    //         String word = words[i];

    //         boolean flag = true;
    //         for(char ch : word.toCharArray()){
    //             if(!allowed.contains(String.valueOf(ch))){
    //                 flag = false;
    //                 break;
    //             }
    //         }
    //         if(flag){
    //             count++;
    //         }
    //     }
    //     return count;
    // }
    public static void main(String args[]){
    /*
    You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

        Return the number of consistent strings in the array words.



        Example 1:

        Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
        Output: 2
        Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
        Example 2:

        Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
        Output: 7
        Explanation: All strings are consistent.
        Example 3:

        Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
        Output: 4
        Explanation: Strings "cc", "acd", "ac", and "d" are consistent.
     */
    }
}
