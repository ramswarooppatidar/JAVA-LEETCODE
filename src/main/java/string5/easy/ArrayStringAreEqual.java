package string5.easy;

public class ArrayStringAreEqual {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int n = word1.length;
        int m = word2.length;
        for(int i =0; i<n; i++){
            sb.append(word1[i]);
        }

        for(int i =0; i<m; i++){
            sb2.append(word2[i]);
        }

        return sb.toString().equals(sb2.toString());
    }
    public static void main(String args[]){
        /*
        Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

        A string is represented by an array if the array elements concatenated in order forms the string.



        Example 1:

        Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
        Output: true
        Explanation:
        word1 represents string "ab" + "c" -> "abc"
        word2 represents string "a" + "bc" -> "abc"
        The strings are the same, so return true.
        Example 2:

        Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
        Output: false
        Example 3:

        Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
        Output: true
         */
    }
}
