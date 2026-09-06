package string.com.string6.easy;

public class SecondLargest {
    public static  int secondHighest(String s) {
        int largest =-1;
        int secondLargest = -1;
        // boolean first = false;
        for(int i =0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                int val = Character.getNumericValue(s.charAt(i));
                if(largest < val){
                    // if(first){
                    //     secondLargest = largest;
                    // }
                    // if(!first){
                    //     first = true;
                    // }
                    secondLargest = largest;
                    largest = val;

                }else if(largest > val && secondLargest < val){
                    secondLargest = val;
                }
            }
        }
        return secondLargest;
    }
    public static void main(String args[]){
        /*
        Given an alphanumeric string s, return the second largest numerical digit
        that appears in s, or -1 if it does not exist.

        An alphanumeric string is a string consisting of lowercase English letters
        and digits.



        Example 1:

        Input: s = "dfa12321afd"
        Output: 2
        Explanation: The digits that appear in s are [1, 2, 3]. The second largest digit is 2.
        Example 2:

        Input: s = "abc1111"
        Output: -1
        Explanation: The digits that appear in s are [1]. There is no second largest digit.

         */
    }
}
