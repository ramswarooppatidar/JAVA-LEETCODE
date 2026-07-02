package string5.easy;

public class MergeAlternatevly {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();
        int i = 0;
        int j = 0;
        while(i < len1 && j < len2){
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }

        while(i < len1){
            sb.append(word1.charAt(i++));
        }

        while(j < len2){
            sb.append(word2.charAt(j++));
        }

        return sb.toString();
    }
    public static void main(String args[]){
        /*
        Example 1:

        Input: word1 = "abc", word2 = "pqr"
        Output: "apbqcr"
        Explanation: The merged string will be merged as so:
        word1:  a   b   c
        word2:    p   q   r
        merged: a p b q c r
        Example 2:

        Input: word1 = "ab", word2 = "pqrs"
        Output: "apbqrs"
        Explanation: Notice that as word2 is longer, "rs" is appended to the end.
        word1:  a   b
        word2:    p   q   r   s
        merged: a p b q   r   s
        Example 3:

        Input: word1 = "abcd", word2 = "pq"
        Output: "apbqcd"
        Explanation: Notice that as word1 is longer, "cd" is appended to the end.
        word1:  a   b   c   d
        word2:    p   q
        merged: a p b q c   d
         */
    }
}
