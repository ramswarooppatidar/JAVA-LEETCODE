package array5.com;

public class MaxScore {
    public static int maxScore(String s){
        int max = 0;

        for(int i =0; i<s.length() - 1; i++){
            String left = s.substring(0, i+1);
            String right = s.substring(i+1, s.length());
            int leftCount =0;
            int rightCount = 0;

            for(char ch : left.toCharArray()){
                if(ch == '0'){
                    leftCount++;
                }
            }
            for(char ch : right.toCharArray()){
                if(ch == '0'){
                    rightCount++;
                }
            }
            max = Math.max(max, rightCount + leftCount);
        }
        return max;
    }
    public static int maxScoreOptimize(String s){
        int totalOnes = 0;
        for(char ch : s.toCharArray()){
            if(ch == '1'){
                totalOnes++;
            }
        }
        int max = 0;
        int zeroLeft =0;
        int oneRight = totalOnes;
        for(int i =0; i<s.length() - 1; i++){
            if(s.charAt(i) == '0'){
                zeroLeft++;
            }else{
                oneRight--;
            }
            max = Math.max(max, zeroLeft + oneRight);
        }
        return  max;
    }
    public static void main(String args[]){
        /*
        Given a string s of zeros and ones, return the maximum score after splitting the string into two non-empty substrings (i.e. left substring and right substring).

        The score after splitting a string is the number of zeros in the left substring plus the number of ones in the right substring.



        Example 1:

        Input: s = "011101"
        Output: 5
        Explanation:
        All possible ways of splitting s into two non-empty substrings are:
        left = "0" and right = "11101", score = 1 + 4 = 5
        left = "01" and right = "1101", score = 1 + 3 = 4
        left = "011" and right = "101", score = 1 + 2 = 3
        left = "0111" and right = "01", score = 1 + 1 = 2
        left = "01110" and right = "1", score = 2 + 1 = 3
        Example 2:

        Input: s = "00111"
        Output: 5
        Explanation: When left = "00" and right = "111", we get the maximum score = 2 + 3 = 5
        Example 3:

        Input: s = "1111"
        Output: 3

         */
    }
}
