package array6.com;

public class ReversePrifWord {
    public String reversePrefix(String word, char ch) {
        char arr[] = word.toCharArray();

        for(int i =0; i<word.length(); i++){
            if(word.charAt(i) == ch){
                reverse(arr, 0, i);
                break;
            }
        }
        return new String(arr);
    }
    private void reverse(char arr[], int left, int right){
        while(left<right){
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }

    }
    /*
    Example 1:

Input: word = "abcdefd", ch = "d"
Output: "dcbaefd"
Explanation: The first occurrence of "d" is at index 3.
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".
Example 2:

Input: word = "xyxzxe", ch = "z"
Output: "zxyxxe"
Explanation: The first and only occurrence of "z" is at index 3.
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "zxyxxe".
Example 3:

Input: word = "abcd", ch = "z"
Output: "abcd"
Explanation: "z" does not exist in word.
You should not do any reverse operation, the resulting string is "abcd".

     */
}
