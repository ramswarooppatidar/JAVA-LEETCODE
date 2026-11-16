package maths.com.maths2.com;

import java.util.Arrays;

public class MinSum {
    public int minSum(int num){
        char digit[] = String.valueOf(num).toCharArray();
        Arrays.sort(digit);
        int new1 = (digit[0] - '0')*10 + digit[2]-'0';
        int new2 = (digit[1] - '0')*10 + digit[3]-'0';
        return new1+new2;
    }
    public int minimumSum(int num) {
        int arr[] = new int[4];
        int i =0;
        while(num > 0){
            arr[i++] = num % 10;
            num /= 10;
        }

        Arrays.sort(arr);
        int sum = 0;
        int left = 0;
        int right = 3;
        while(left < right){
            sum += arr[left++]*10 + arr[right--];
            // System.out.println("sum is :"+sum);
        }
        return sum;
    }
    public static void main(String args[]){
        /*
        2160. Minimum Sum of Four Digit Number After Splitting Digits

        For example, given num = 2932, you have the following digits: two 2's, one 9
        and one 3. Some of the possible pairs [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].
        Return the minimum possible sum of new1 and new2.
        Example 1:
        Input: num = 2932
        Output: 52
        Explanation: Some possible pairs [new1, new2] are [29, 23], [223, 9], etc.
        The minimum sum can be obtained by the pair [29, 23]: 29 + 23 = 52.
        Example 2:

        Input: num = 4009
        Output: 13
        Explanation: Some possible pairs [new1, new2] are [0, 49], [490, 0], etc.
        The minimum sum can be obtained by the pair [4, 9]: 4 + 9 = 13.
         */
    }
}
