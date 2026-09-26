package string6.easy;

public class BrokenLetter {
    public int canBeTypedWords(String text, String brokenLetters) {
        String str[] = text.split(" ");
        int count = 0;
        for(String s : str){
            Boolean check = true;
            for(int i =0; i<s.length(); i++){
                char ch = s.charAt(i);
                if(brokenLetters.indexOf(ch) != -1){
                    check = false;
                    break;
                }
            }
            if(check){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        /*
        1935. Maximum Number of Words You Can Type

Example 1:

Input: text = "hello world", brokenLetters = "ad"
Output: 1
Explanation: We cannot type "world" because the 'd' key is broken.
Example 2:

Input: text = "leet code", brokenLetters = "lt"
Output: 1
Explanation: We cannot type "leet" because the 'l' and 't' keys are broken.
Example 3:

Input: text = "leet code", brokenLetters = "e"
Output: 0
Explanation: We cannot type either word because the 'e' key is broken.

         */
    }
}
