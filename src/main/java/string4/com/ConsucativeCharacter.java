package string4.com;

public class ConsucativeCharacter {
    /*
    int count = 0;
        int max = 0;
        this condition failed at  s = "j" and s ="cc"
;     */
    public static int maxPower(String s){
        int count = 1;
        int max = 1;
        for(int i = 1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }else{
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }
    public int maxPower2(String s) {
        int pow = 0;
        for(int i =0; i<s.length();i++){
            char ch = s.charAt(i);
            int left = i;
            int count = 1;
            while((left + 1) < s.length() && s.charAt(left) == s.charAt(left + 1)){
                count++;
                left++;
            }
            pow = Math.max(pow, count);
        }
        return pow;
    }
    public static void main(String args[]){
        /*
        The power of the string is the maximum length of a non-empty substring that contains only one unique character.

        Given a string s, return the power of s.



        Example 1:

        Input: s = "leetcode"
        Output: 2
        Explanation: The substring "ee" is of length 2 with the character 'e' only.
        Example 2:

        Input: s = "abbcccddddeeeeedcba"
        Output: 5
        Explanation: The substring "eeeee" is of length 5 with the character 'e' only.

         Input: s = "j"
        Output: 1

         Input: s = "cc"
        Output: 2

         */
    }
}
