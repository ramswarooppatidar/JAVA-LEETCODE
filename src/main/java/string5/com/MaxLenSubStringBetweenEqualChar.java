package string5.com;

public class MaxLenSubStringBetweenEqualChar {
    public static int maxLenSubstringBetweenEqualChar(String s){
        int maxLen = -1;
//        boolean isExistDoblicateChar = false;
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            for(int j = i; j<s.length(); j++){
                if(ch == s.charAt(j)){
                    int len = j - i + 1 -2;
                    maxLen = Math.max(maxLen, len);
//                    isExistDoblicateChar = true;
                }
            }
        }
        return maxLen;
    }
    public static void main(String argd[]){

        System.out.println(maxLenSubstringBetweenEqualChar("aa"));
        System.out.println(maxLenSubstringBetweenEqualChar("abca"));
        System.out.println(maxLenSubstringBetweenEqualChar("cbzxy"));
        /*
        Example 1:

        Input: s = "aa"
        Output: 0
        Explanation: The optimal substring here is an empty substring between the two 'a's.
        Example 2:

        Input: s = "abca"
        Output: 2
        Explanation: The optimal substring here is "bc".
        Example 3:

        Input: s = "cbzxy"
        Output: -1
        Explanation: There are no characters that appear twice in s.
         */
    }
}
