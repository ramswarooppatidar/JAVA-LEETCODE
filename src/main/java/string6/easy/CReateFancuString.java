package string6.easy;

public class CReateFancuString {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(sb.length() >= 2 && sb.charAt(sb.length() - 2) == ch && sb.charAt(sb.length() - 1) == ch ){
                //sb.charAt(i - 2) == ch && sb.charAt(i - 1)some letter we not add so  wrong bcz
            }
            else{
                sb.append(ch);
            }
            // System.out.println(sb.toString());
        }
        return sb.toString();
    }
    public static void main(String args[]){
        /*
        Example 1:

Input: s = "leeetcode"
Output: "leetcode"
Explanation:
Remove an 'e' from the first group of 'e's to create "leetcode".
No three consecutive characters are equal, so return "leetcode".
Example 2:

Input: s = "aaabaaaa"
Output: "aabaa"
Explanation:
Remove an 'a' from the first group of 'a's to create "aabaaaa".
Remove two 'a's from the second group of 'a's to create "aabaa".
No three consecutive characters are equal, so return "aabaa".
Example 3:

Input: s = "aab"
Output: "aab"
Explanation: No three consecutive characters are equal, so return "aab".



         */
    }
}
