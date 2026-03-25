package string4.com;

public class PrefixOfWord {
    public int isPrefixOfWord(String sentence, String searchWord) {

        String[] words = sentence.split(" ");

        for(int i = 0; i < words.length; i++){
            if(words[i].startsWith(searchWord)){
                return i + 1; // 1-based index
            }
        }

        return -1;
    }

    public int isPrefixOfWord2(String sentence, String searchWord) {
        StringBuilder sb = new StringBuilder();
        for(char ch : sentence.toCharArray()){
            sb.append(ch);
        }
        int len = searchWord.length();
        int result = 1;

        for(int i =0; i<sb.length()-len; i++){
            int left = i;
            int right = left + len;
            int j =0;
            boolean isPresent = true;
            while(left < right){
                if(sb.charAt(left) == ' '){
                    result++;
                }
                if(searchWord.charAt(j++) != sb.charAt(left++)){
                    isPresent = false;
                    break;
                }
            }
            if(isPresent){
                return result;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        /*
        Given a sentence that consists of some words separated by a single space, and a searchWord, check if searchWord is a prefix of any word in sentence.

        Return the index of the word in sentence (1-indexed) where searchWord is a prefix of this word. If searchWord is a prefix of more than one word, return the index of the first word (minimum index). If there is no such word return -1.

        A prefix of a string s is any leading contiguous substring of s.



        Example 1:

        Input: sentence = "i love eating burger", searchWord = "burg"
        Output: 4
        Explanation: "burg" is prefix of "burger" which is the 4th word in the sentence.
        Example 2:

        Input: sentence = "this problem is an easy problem", searchWord = "pro"
        Output: 2
        Explanation: "pro" is prefix of "problem" which is the 2nd and the 6th word in the sentence, but we return 2 as it's the minimal index.
        Example 3:

        Input: sentence = "i am tired", searchWord = "you"
        Output: -1
        Explanation: "you" is not a prefix of any word in the sentence.

         */
    }
}
