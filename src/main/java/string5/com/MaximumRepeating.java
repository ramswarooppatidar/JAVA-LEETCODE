package string5.com;

public class MaximumRepeating {
    public int maxRepeating(String sequence, String word) {
        StringBuilder reapeating = new StringBuilder();
        int count = 0;
        while(true){
            reapeating.append(word);
            if(sequence.contains(reapeating.toString())){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
    // public int maxRepeating(String sequence, String word) {
    //     StringBuilder sb = new StringBuilder();
    //     int count = 0;
    //     for(int i =0; i<sequence.length(); i++){
    //         sb.append(String.valueOf(sequence.charAt(i)));
    //         if(sb.indexOf(word) != -1){
    //                 count++;
    //             sb = new StringBuilder();
    //         }
    //     }
    //     return count;
    // }
    public static void main(String args[]){
        /*
        For a string sequence, a string word is k-repeating if word concatenated
        k times is a substring of sequence. The word's maximum k-repeating value
        is the highest value k where word is k-repeating in sequence. If word is
        not a substring of sequence, word's maximum k-repeating value is 0.

        Given strings sequence and word, return the maximum k-repeating value of word in sequence.



        Example 1:

        Input: sequence = "ababc", word = "ab"
        Output: 2
        Explanation: "abab" is a substring in "ababc".
        Example 2:

        Input: sequence = "ababc", word = "ba"
        Output: 1
        Explanation: "ba" is a substring in "ababc". "baba" is not a substring in "ababc".
        Example 3:

        Input: sequence = "ababc", word = "ac"
        Output: 0
        Explanation: "ac" is not a substring in "ababc".
         */
    }
}
