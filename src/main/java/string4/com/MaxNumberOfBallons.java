package string4.com;

public class MaxNumberOfBallons {
    public int maxNumberOfBalloons(String text) {
        int index[] = new int[26];
        for(int i =0; i<text.length(); i++){
            char ch = text.charAt(i);
            index[ch - 'a']++;
        }

        int min=index['b' -'a'];
        min = Math.min(min, index['a' - 'a']);
        min = Math.min(min, index['l' - 'a'] / 2);
        min = Math.min(min, index['o' - 'a'] / 2);
        min = Math.min(min, index['n' - 'a']);
        // for(int i =0; i<text.length(); i++){
        //    if(index[text.charAt(i) - 'a'] != 0
        //    && "balloon".contains(String.valueOf(text.charAt(i))) ){
        //       min = Math.min(min, index[text.charAt(i) - 'a']);
        //    }
        // }
        return min;
    }
    public static void main(String args[]){
        /*
        Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.

You can use each character in text at most once. Return the maximum number of instances that can be formed.



Example 1:



Input: text = "nlaebolko"
Output: 1
Example 2:



Input: text = "loonbalxballpoon"
Output: 2
Example 3:

Input: text = "leetcode"
Output: 0

         */
    }
}
