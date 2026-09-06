package array6.com;

public class MaxAcendingSum {
    public static int maxAscendingSum(int[] nums) {
        int sum = 0;
        int currSum = 0;
        for(int i =0; i<nums.length; i++){
            if(i+1<nums.length && nums[i]<nums[i + 1]){
                currSum += nums[i];
            }else{
                currSum += nums[i];
                sum = Math.max(currSum, sum);
                currSum = 0;
            }
        }
        return sum;
    }
    public static void main(String args[]){
        /*
        Given an array of positive integers nums, return the maximum possible sum of an strictly increasing subarray in nums.

A subarray is defined as a contiguous sequence of numbers in an array.



Example 1:

Input: nums = [10,20,30,5,10,50]
Output: 65
Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.
Example 2:

Input: nums = [10,20,30,40,50]
Output: 150
Explanation: [10,20,30,40,50] is the ascending subarray with the maximum sum of 150.
Example 3:

Input: nums = [12,17,15,13,10,11,12]
Output: 33
Explanation: [10,11,12] is the ascending subarray with the maximum sum of 33.
         */
    }
}
