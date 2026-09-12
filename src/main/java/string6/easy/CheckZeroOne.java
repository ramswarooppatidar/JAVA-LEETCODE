package string6.easy;

public class CheckZeroOne {
    public boolean checkZeroOnes(String s) {
        int oneCount = 0;
        int zeroCount = 0;
        int oneMax = 0;
        int zeroMax = 0;
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '1'){
                zeroMax = Math.max(zeroMax, zeroCount);
                zeroCount = 0;
                oneCount++;
                // System.out.println("One Count :"+oneCount);
            }else{
                oneMax = Math.max(oneMax, oneCount);
                oneCount = 0;
                zeroCount++;
                // System.out.println("zero Count :"+zeroCount);
            }
        }
        zeroMax = Math.max(zeroMax, zeroCount);
        oneMax = Math.max(oneMax, oneCount);
        // System.out.println(oneMax +" : " + zeroMax);
        return oneMax > zeroMax;
    }
    public static void main(String args[]){
        /*
        Given a binary string s, return true if the longest contiguous segment of 1's is strictly longer than the longest contiguous segment of 0's in s, or return false otherwise.
        For example, in s = "110100010" the longest continuous segment of 1s has length 2, and the longest continuous segment of 0s has length 3.
        Note that if there are no 0's, then the longest continuous segment of 0's is considered to have a length 0. The same applies if there is no 1's.
        Example 1:

        Input: s = "1101"
        Output: true
        Explanation:
        The longest contiguous segment of 1s has length 2: "1101"
        The longest contiguous segment of 0s has length 1: "1101"
        The segment of 1s is longer, so return true.
        Example 2:

        Input: s = "111000"
        Output: false
        Explanation:
        The longest contiguous segment of 1s has length 3: "111000"
        The longest contiguous segment of 0s has length 3: "111000"
        The segment of 1s is not longer, so return false.
        Example 3:

        Input: s = "110100010"
        Output: false
        Explanation:
        The longest contiguous segment of 1s has length 2: "110100010"
        The longest contiguous segment of 0s has length 3: "110100010"
        The segment of 1s is not longer, so return false.
         */
    }
}
