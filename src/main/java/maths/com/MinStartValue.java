package maths.com;

public class MinStartValue {
    /*
            We want:

                startValue + runningSum >= 1   (at every step)

                So:

                startValue >= 1 - (minimum running sum)
                ✅ Formula
                startValue = 1 - minPrefixSum
     */
    public int minStartValue(int[] nums) {
        int sum = 0;
        int minSum = 0;
        for(int i : nums){
            sum += i;
            minSum = Math.min(minSum, sum);
        }
        return 1 - minSum;
    }
    public int minStartValue2(int[] nums) {
        int minPositive = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : nums){
            if(i> 0 && i < minPositive){
                minPositive = i;
            }

        }
        System.out.println("minPositive : "+minPositive);
        for(int i = 1 ; i<=1900; i++){
            int res = i;
            boolean isValid = true;
            for(int j =0; j<nums.length; j++){
                res += nums[j];
                // System.out.println("res : "+res);
                if(res < 1){
                    isValid = false;
                    break;
                }
            }
            if(isValid){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        /*
        Given an array of integers nums, you start with an initial positive value startValue.

In each iteration, you calculate the step by step sum of startValue plus elements in nums (from left to right).

Return the minimum positive value of startValue such that the step by step sum is never less than 1.



Example 1:

Input: nums = [-3,2,-3,4,2]
Output: 5
Explanation: If you choose startValue = 4, in the third iteration your step by step sum is less than 1.
step by step sum
startValue = 4 | startValue = 5 | nums
  (4 -3 ) = 1  | (5 -3 ) = 2    |  -3
  (1 +2 ) = 3  | (2 +2 ) = 4    |   2
  (3 -3 ) = 0  | (4 -3 ) = 1    |  -3
  (0 +4 ) = 4  | (1 +4 ) = 5    |   4
  (4 +2 ) = 6  | (5 +2 ) = 7    |   2
Example 2:

Input: nums = [1,2]
Output: 1
Explanation: Minimum start value should be positive.
Example 3:

Input: nums = [1,-2,-3]
Output: 5

         */
    }
}
