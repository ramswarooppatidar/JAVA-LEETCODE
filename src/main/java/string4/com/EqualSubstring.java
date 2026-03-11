package string4.com;

public class EqualSubstring {
    public static int equalSubstring(String s, String t, int maxCost){
        int left =0;
        int maxLen = 0;
        int cost =0;
        for(int right = 0; right < s.length(); right++){
            cost += Math.abs(s.charAt(right) - t.charAt(right));

            while(cost > maxCost){
                cost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }

            maxLen = Math.max(maxLen, (right - left + 1));
        }
        return maxLen;
    }
    public static int equalSubstring2(String s, String t, int maxCost){
        int len = 0;
        for(int i =0; i<s.length(); i++){
            int diff =0;
            for(int j =i; j<s.length(); j++){
                int absdiff = Math.abs(s.charAt(j) - t.charAt(j));
                diff += absdiff;

                if(diff > maxCost){
                    break;
                }

                len = Math.max(len, (j - i + 1));
            }
        }
        return len;
    }
    public static void main(String argsd[]){
     /*
     Example 1:

        Input: s = "abcd", t = "bcdf", maxCost = 3
        Output: 3
        Explanation: "abc" of s can change to "bcd".
        That costs 3, so the maximum length is 3.
        Example 2:

        Input: s = "abcd", t = "cdef", maxCost = 3
        Output: 1
        Explanation: Each character in s costs 2 to change to character in t,  so the maximum length is 1.
        Example 3:

        Input: s = "abcd", t = "acde", maxCost = 0
        Output: 1
        Explanation: You cannot make any change, so the maximum length is 1.
      */
    }
}
