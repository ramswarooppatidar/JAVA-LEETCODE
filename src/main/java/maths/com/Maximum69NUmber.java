package maths.com;

public class Maximum69NUmber {
    public int maximum69Number (int num) {
        int digit = 0;
        int result = 0;
        while(num > 0){
            int rem = num % 10;
            digit = digit*10 + rem;
            num /= 10;
        }

        boolean isChange = true;
        while(digit > 0){
            int rem = digit % 10;
            if(isChange){
                if(rem == 6){
                    result = result*10 + 9;
                    isChange = false;
                }else{
                    result = result*10 + rem;
                }
            }else{
                result = result*10 + rem;
            }
            digit /= 10;
        }

        return result;
    }
    public static void main(String args[]){
        /*
            You are given a positive integer num consisting only of digits 6 and 9.

            Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).



            Example 1:

            Input: num = 9669
            Output: 9969
            Explanation:
            Changing the first digit results in 6669.
            Changing the second digit results in 9969.
            Changing the third digit results in 9699.
            Changing the fourth digit results in 9666.
            The maximum number is 9969.
            Example 2:

            Input: num = 9996
            Output: 9999
            Explanation: Changing the last digit 6 to 9 results in the maximum number.
            Example 3:

            Input: num = 9999
            Output: 9999
            Explanation: It is better not to apply any change.

         */
    }
}
