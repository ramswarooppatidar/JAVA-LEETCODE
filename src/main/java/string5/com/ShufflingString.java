package string5.com;

public class ShufflingString {
    public String restoreString(String s, int[] indices) {
        char ch[] = new char[s.length()];
        for(int i =0; i<s.length(); i++){
            ch[indices[i]] = s.charAt(i);
        }
        return new String(ch);
    }
    // public String restoreString(String s, int[] indices) {
    //     StringBuilder sb = new StringBuilder();
    //     for(int i =0; i<indices.length; i++){
    //         sb.append(String.valueOf(s.charAt(indices[i])));
    //         System.out.println(sb);
    //     }
    //     return sb.toString();
    // }
    public static void main(String args[]){
        /*
        You are given a string s and an integer array indices of the same length. The string s will be shuffled such
        that the character at the ith position moves to indices[i] in the shuffled string.
        Return the shuffled string.
        Example 1:

        Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
        Output: "leetcode"
        Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
        Example 2:

        Input: s = "abc", indices = [0,1,2]
        Output: "abc"
        Explanation: After shuffling, each character remains in its position.

         */
    }
}
