package string5.easy;

public class CheckOneSegments {
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
    public boolean checkOnesSegment2(String s) {
        boolean seenZero = false;
        for(char ch : s.toCharArray()){
            if(ch == '0'){
                seenZero = true;
            }else if(seenZero){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        /*
        Given a binary string s ​​​​​without leading zeros, return true​​​ if s contains at most one contiguous segment of ones. Otherwise, return false.

Given a binary string s ​​​​​without leading zeros, return true​​​ if s contains at most one contiguous segment of ones. Otherwise, return false.
Given a binary string s ​​​​​without leading zeros, return true​​​ if s contains at most one contiguous segment of ones. Otherwise, return false.
Example 1:

Input: s = "1001"
Output: false
Explanation: The string has two segments of size 1.
Example 2:

Input: s = "110"
Output: true
         */
    }
}
